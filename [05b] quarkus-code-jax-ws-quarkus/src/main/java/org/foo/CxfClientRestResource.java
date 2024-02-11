package org.foo;
//https://github.com/quarkiverse/quarkus-cxf/blob/main/integration-tests/client/src/main/java/io/quarkiverse/cxf/client/it/CxfClientResource.java

import jakarta.ws.rs.Path;
import jakarta.xml.ws.BindingProvider;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.UUID;


import at.co.svc.soap.client.bpkLesen.BkStatusKZVO;
import at.co.svc.soap.client.bpkLesen.BpkLesen;
import at.co.svc.soap.client.bpkLesen.DtObPKLEI;
import at.co.svc.soap.client.bpkLesen.DtObPKListeLEI;
import at.co.svc.soap.client.bpkLesen.DtObPKListeLEO;
import at.co.svc.soap.client.bpkLesen.DtoBearbeiter;
import at.co.svc.soap.client.bpkLesen.DtoKontextRQ;
import at.co.svc.soap.client.bpkLesen.DtoPartnerParrolleIdentifikation;
import at.co.svc.soap.client.bpkLesen.DtoQuellsystem;
import at.co.svc.soap.client.bpkLesen.DtoRequestHeader;
import at.co.svc.soap.client.bpkLesen.DtoZielsystem;
import at.co.svc.soap.client.bpkLesen.SEBpkLesenService;
import io.quarkiverse.cxf.annotation.CXFClient;

@Path("BPKLesen")
public class CxfClientRestResource {

    @CXFClient("myCalculator") // name used in application.properties
    BpkLesen pkLesen;

/** Tutoriial sagt "nutzt es" aber ..man braucht es nicht 
    @GET
    @Path("BPKLesen")
    @Produces(MediaType.TEXT_PLAIN)
    **/
    public DtObPKListeLEO bpkLesen(long zpvPartnerId, List<String> bereiche) {
      
      
      DtObPKListeLEI request = buildInputData(zpvPartnerId, bereiche);
      DtObPKListeLEO responseRaw = null;

      responseRaw =  initializeClientStub(new SEBpkLesenService().getBpkLesenPort(), 
        "http://localhost:8090/EcSrvSimZpv/services/BPKLesen",
        "34ECARD", 
        "aVk2y0Z7IcDZz3E7yjMP").bPkLesen(request);
      
      System.out.println(responseRaw.toString());
      
      return responseRaw;
    }

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

    
    // Apache CXF request context property keys for ws security username / password
    private static final String WSSEC_USERNAME_KEY = "ws-security.username";
    private static final String WSSEC_PASSWORD_KEY = "ws-security.password";

    public static <T> T initializeClientStub(T stub, String endpointUrl, String username, String password) {

      // Set endpoint
      Map<String, Object> context = ((BindingProvider) stub).getRequestContext();
      context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
      context.put(BindingProvider.USERNAME_PROPERTY, username);
      context.put(BindingProvider.PASSWORD_PROPERTY, password);
      context.put(WSSEC_USERNAME_KEY, username);
      context.put(WSSEC_PASSWORD_KEY, password);

      return stub;
    }

}