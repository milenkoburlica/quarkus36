/*
 * (C) SVC 2019
 */
package at.chipkarte.server.aum.simu;

import java.util.TimeZone;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.interceptor.InInterceptors;

import at.itsv.eaum.Ausgangszeit;
import at.itsv.eaum.EAUMPortType;
import at.itsv.eaum.MeldungRequest;
import at.itsv.eaum.MeldungResponse;
import at.itsv.eaum.MeldungsInhalt;
import at.itsv.eaum.SVPerson;

/**
 * EAUM Server simulation.
 */

@WebService(endpointInterface = "at.itsv.eaum.EAUMPortType")
@InInterceptors(interceptors = {"at.chipkarte.server.aum.simu.ServerPasswordCallback"})
public class EAUMSkeletonSecure implements EAUMPortType {
  private static final String STATUS_CODE_ERROR = "500";
  private static final String ERROR_TEXT = "500: ERROR!!!";
  private static final String USER_ERROR_TEXT = "500: User requested Error.";
  private static final String STATUS_CODE_OK = "000";
  private static final String OK_TEXT = "OK";

  /**
   * If <tt>diagnoseText</tt> is set and contains the value "Fehler" (upper- or lowercase letters), the method returns
   * an error; otherwise, it returns OK. Besides, the request and response (plus some additional information) are logged.
   * @param meldungRequest
   * @return meldungResponse
   */

  public MeldungResponse meldung(MeldungRequest meldungRequest) {
    String statusCode = null;
    String statusText = null;
    MeldungResponse msg = new MeldungResponse();
    if (meldungRequest == null || meldungRequest.getMeldungsInfo() == null || meldungRequest.getMeldungsInhalt() == null) {
      AumRequestResponseLogger.logErr("Parameter not valid!!!");
      statusCode = STATUS_CODE_ERROR;
      statusText = ERROR_TEXT;
    }
    if (meldungRequest.getMeldungsInhalt().getDiagnose() != null
        && meldungRequest.getMeldungsInhalt().getDiagnose().getDiagnoseText() != null
        && meldungRequest.getMeldungsInhalt().getDiagnose().getDiagnoseText().compareToIgnoreCase("Fehler") == 0) {
      statusCode = STATUS_CODE_ERROR;
      statusText = USER_ERROR_TEXT;
    }
    else {
      AumRequestResponseLogger.logRequest(meldungRequest);

      MeldungsInhalt mInhalt = meldungRequest.getMeldungsInhalt();
      AumRequestResponseLogger.log("MeldungsArt: " + mInhalt.getMeldungsArt().value());
      boolean ohneAnspruch =
          (mInhalt.getPerson() instanceof SVPerson ? ((SVPerson) mInhalt.getPerson()).isOhneAnspruch() : false);
      AumRequestResponseLogger.log("ohneAnspruch: " + ohneAnspruch);

      AumRequestResponseLogger.log("Timestamps-MeldungsInhalt:");
      logAusgehzeiten("Meldung->AusgangsVonZeit1: ", mInhalt.getAusgangZeit1());
      logAusgehzeiten("Meldung->AusgangsBisZeit1: ", mInhalt.getAusgangZeit2());

      if (mInhalt.getAnstaltAufenthalt() != null) {
        logDate("AnstaltVonDat: ", mInhalt.getAnstaltAufenthalt().getAnstaltVonDat());
        logDate("AnstaltBisDat: ", mInhalt.getAnstaltAufenthalt().getAnstaltBisDat());
      }
      logDate("AubeginnDat: ", mInhalt.getAubeginnDat());
      logDate("AuendeDat: ", mInhalt.getAuendeDat());
      logDate("ErstellungsDat: ", mInhalt.getErstellungsDat());
      logDate("GehunfaehigBisDat: ", mInhalt.getGehunfaehigBisDat());
      logDate("GipsBisDat: ", mInhalt.getGipsBisDat());
      logDate("VoraussauendeDat: ", mInhalt.getVoraussauendeDat());
      logDate("WiederbestellDat: ", mInhalt.getWiederbestellDat());
      statusCode = STATUS_CODE_OK;
      statusText = OK_TEXT;
    }

    msg.setStatusCode(statusCode);
    msg.setStatusText(statusText);

    AumRequestResponseLogger.logResponse(msg);
    return msg;
  }

  private void logAusgehzeiten(String logText, Ausgangszeit ausgehzeit) {
    if (ausgehzeit != null) {
      logZeit(logText + " von", ausgehzeit.getAusgangVonZeit());
      logZeit(logText + " bis", ausgehzeit.getAusgangBisZeit());
    }
  }

  private void logZeit(String logText, XMLGregorianCalendar xmlGregorianCalendar) {
    if (xmlGregorianCalendar != null) {
      int offset = ((TimeZone.getTimeZone("GMT+1").getRawOffset()) / 1000) / 60;
      xmlGregorianCalendar.setTimezone(offset);
      logDate(logText, xmlGregorianCalendar);
    }
  }

  private void logDate(String logText, XMLGregorianCalendar xmlGregorianCalendar) {
    if (xmlGregorianCalendar != null) {
      AumRequestResponseLogger.log(logText + xmlGregorianCalendar.toString());
    }
  }
}
