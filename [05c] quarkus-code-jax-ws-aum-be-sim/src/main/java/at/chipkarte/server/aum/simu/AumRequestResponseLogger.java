/*
 * (C) SVC 2007
 */
package at.chipkarte.server.aum.simu;

import java.io.StringWriter;

import javax.xml.bind.JAXB;

import at.itsv.eaum.MeldungRequest;
import at.itsv.eaum.MeldungResponse;
//import at.siemens.ecard.server.common.logging.ITraceLogger;
//import at.siemens.ecard.server.common.logging.LogFactory;

/**
 * Logger to write response/request informations to TraceLog using <code>XMLEncoder</code>
 * (@see java.beans.XMLEncoder).
 */
public class AumRequestResponseLogger {

  /**
  * trace-logger
  */
//  private static ITraceLogger TLOG = LogFactory.getTraceLog(AumRequestResponseLogger.class);

  /**
   * method for logging requests
   * @see AumRequestResponseLogger#log(Object)
   * @param req request to be logged
   */
  public static void logRequest(MeldungRequest req) {
//    TLOG.entering("logRequest");
//    StringWriter sw = new StringWriter();
//    JAXB.marshal(req, sw);
//    log(sw.toString());
//    TLOG.exiting("logRequest");
  }

  /**
  * method for logging response
  * @see AumRequestResponseLogger#log(Object)
  * @param res response to be logged
  */
  public static void logResponse(MeldungResponse res) {
//    TLOG.entering("logResponse");
//    StringWriter sw = new StringWriter();
//    JAXB.marshal(res, sw);
//    log(sw.toString());
//    TLOG.exiting("logResponse");
  }



  public static void log(String obj) {
//    TLOG.info(obj);
  }

  public static void logErr(String obj) {
//    TLOG.error(obj);
  }

}
