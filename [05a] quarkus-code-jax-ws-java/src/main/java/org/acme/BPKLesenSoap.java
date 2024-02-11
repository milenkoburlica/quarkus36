package org.acme;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import at.co.svc.soap.client.bpkLesen.BkStatusKZVO;
import at.co.svc.soap.client.bpkLesen.BkStornoinformationVO;
import at.co.svc.soap.client.bpkLesen.BpkLesen;
import at.co.svc.soap.client.bpkLesen.DtObPK;
import at.co.svc.soap.client.bpkLesen.DtObPKLEI;
import at.co.svc.soap.client.bpkLesen.DtObPKListeLEI;
import at.co.svc.soap.client.bpkLesen.DtObPKListeLEO;
import at.co.svc.soap.client.bpkLesen.DtoBearbeiter;
import at.co.svc.soap.client.bpkLesen.DtoKontextRQ;
import at.co.svc.soap.client.bpkLesen.DtoPartnerKurz;
import at.co.svc.soap.client.bpkLesen.DtoPartnerParrolleIdentifikation;
import at.co.svc.soap.client.bpkLesen.DtoQuellsystem;
import at.co.svc.soap.client.bpkLesen.DtoRequestHeader;
import at.co.svc.soap.client.bpkLesen.DtoZielsystem;
import at.co.svc.soap.client.bpkLesen.SEBpkLesenService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public final class BPKLesenSoap {


  public BpkLesen _clientStub;

  private BpkLesen getClientStub() {
    if (_clientStub == null) {
      _clientStub = BpkUpdateUtil.initializeClientStub(
        new SEBpkLesenService().getBpkLesenPort(), 
        "http://localhost:8090/EcSrvSimZpv/services/BPKLesen",
        "34ECARD", 
        "aVk2y0Z7IcDZz3E7yjMP"
        );
    }
    return _clientStub;
  }

  /**
   * Retrieves the Partner Info via Soap Request.
   * @param zpvPartnerId the partner id
   * @param bereiche the fields we want bpks for
   * @return the partner info
   */
  private DtObPKListeLEI buildInputData(long zpvPartnerId, List<String> bereiche) {
    var ret = new DtObPKListeLEI();

    // Fill the header for the SVSTD-11 and SVSTD-81
    ret.setDtoRequestHeader(fillHeader(new DtoRequestHeader()));

    // Set the infos for each area
    for (String bereich : bereiche) {
      var bpkAnforderung = new DtObPKLEI();
      bpkAnforderung.setBearbeiterinfoJN("N");
      bpkAnforderung.setPartnerDiakritischJN("N");
      bpkAnforderung.setBpkBereichKurz(bereich);
      var partner = new DtoPartnerParrolleIdentifikation();
      partner.setParParrolleID(BigInteger.valueOf(zpvPartnerId));
      bpkAnforderung.setDtoPartnerParrolleIdentifikation(partner);
      // Insurance number
      bpkAnforderung.setPartnerrollenartKurzAnforderung("VS");
      var status = new BkStatusKZVO();
      // request bPKs with any status
      status.setStatusKZ("L");
      bpkAnforderung.setBkStatusKZ(status);
      // Add it to the request
      ret.getDtobPKLEIListe().add(bpkAnforderung);
    }
    return ret;
  }


  public ZpvPartnerInfo bpkLesen(long zpvPartnerId, List<String> bereiche) {

    DtObPKListeLEI request = buildInputData(zpvPartnerId, bereiche);
    DtObPKListeLEO responseRaw = null;
    try {
      responseRaw = getClientStub().bPkLesen(request);
    }
    catch (Exception e) {
      throw new RuntimeException("Das BPKLesenService hat eine Exception geworfen!", e);
    }
    return extractResponse(zpvPartnerId, responseRaw, bereiche);
  }

  private ZpvPartnerInfo extractResponse(long zpvPartnerId, DtObPKListeLEO responseRaw, List<String> bereiche) {
    DtoPartnerKurz partner = responseRaw.getDtobPKLEOListe().stream().map(r -> r.getDtoPartnerKurz()).filter(
      Objects::nonNull).findAny().orElse(null);

    // explicitly check for ZP2010 (Partner storniert)
    boolean partnerStorniert = responseRaw.getDtobPKLEOListe().stream().map(r -> r.getZusatzFehlerpaket()).filter(
      f -> "N".equals(f.getIstOk())).flatMap(r -> r.getMeldungen().stream()).anyMatch(m -> "ZP2010".equals(m.getId()));
    if (partnerStorniert) {
      return new ZpvPartnerInfo(zpvPartnerId);
    }

    if (partner == null) {
      return null;
    }

    zpvPartnerId = partner.getParParrolleIDPartner().longValue();
    // this probably never happens, because if partner is storniert, we get Error ZP2010, see above
    boolean partnerGueltig = "N".equals(partner.getStornoJN());
    if (!partnerGueltig) {
      return new ZpvPartnerInfo(zpvPartnerId);
    }
    // if svnr is storniert, the whole element containing it is missing!
    Optional<String> svnrOpt = responseRaw.getDtobPKLEOListe().stream().map(r -> r.getDtoPartnerrolleKurz()).filter(
      r -> r != null).findAny().map(pr -> pr.getFsPartnerrolle());
    partnerGueltig = svnrOpt.isPresent();
    if (!partnerGueltig) {
      return new ZpvPartnerInfo(zpvPartnerId);
    }
    ZpvPartnerInfo ret = new ZpvPartnerInfo(zpvPartnerId, partnerGueltig, svnrOpt.get());
    // extract bpk verschluesselt
    responseRaw.getDtobPKLEOListe().stream().flatMap(l -> l.getDtobPKListe().stream()).filter(
      bpkInfo -> bpkInfo.getBpkVerschluesselt() != null).forEach(
        bpkInfo -> ret.addBpkInfo(bpkInfo.getBpkVerschluesselt(), bpkInfo.getBpkBereichKurz(), true, isGueltig(bpkInfo)));
    // extract bpk unverschluesselt - only for SV
    responseRaw.getDtobPKLEOListe().stream().flatMap(l -> l.getDtobPKListe().stream()).filter(
      bpkInfo -> bpkInfo.getBpkUnverschluesselt() != null).forEach(
        bpkInfo -> ret.addBpkInfo(bpkInfo.getBpkUnverschluesselt(), bpkInfo.getBpkBereichKurz(), false, isGueltig(bpkInfo)));

    return ret;
  }


  private boolean isGueltig(DtObPK bpkInfo) {
    return Optional.ofNullable(bpkInfo).map(DtObPK::getBkStornoinformation).map(BkStornoinformationVO::getStornoJN).map(
      this::isGueltig).orElse(true);
  }

  private boolean isGueltig(String stornoJN) {
    return "N".equals(stornoJN);
  }

  public static DtoRequestHeader fillHeader(final DtoRequestHeader header) {

    final DtoQuellsystem dtoQuellSystem = new DtoQuellsystem();
    dtoQuellSystem.setQuellSystemApplikationsId("ECARD");
    dtoQuellSystem.setQuellSystemSystemId("ECARDT");
    header.setDtoQuellsystem(dtoQuellSystem);

    // Kontext
    final DtoKontextRQ dtoKontextRQ = new DtoKontextRQ();

    // Bearbeiter
    final DtoBearbeiter dtoBearbeiter = new DtoBearbeiter();
    dtoBearbeiter.setBearbeiterId("SVC_1");
    dtoBearbeiter.setBerechtigungsSystemId("ECARD");
    dtoBearbeiter.setMeldendeStelle("34");
    dtoKontextRQ.setDtoBearbeiter(dtoBearbeiter);

    // Kontext
    dtoKontextRQ.setTransaktionsID(UUID.randomUUID().toString());
    dtoKontextRQ.setVerarbeitungsModus("O");
    dtoKontextRQ.setPrimaerSystemId("ECARDT");
    dtoKontextRQ.setEbenenSequenzNummer(BigInteger.valueOf(1));
    header.setDtoKontextRQ(dtoKontextRQ);

    // Zielsystem
    final DtoZielsystem dtoZielSystem = new DtoZielsystem();
    dtoZielSystem.setZielSystemModus("V");
    header.setDtoZielsystem(dtoZielSystem);

    // NachrichtId
    header.setNachrichtId(UUID.randomUUID().toString());
    header.setZeichenmenge("LATEST");

    return header;
  }

}
