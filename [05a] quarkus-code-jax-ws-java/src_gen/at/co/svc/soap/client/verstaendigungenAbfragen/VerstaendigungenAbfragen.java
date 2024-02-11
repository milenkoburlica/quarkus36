
package at.co.svc.soap.client.verstaendigungenAbfragen;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "VerstaendigungenAbfragen", targetNamespace = "http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VerstaendigungenAbfragen {


    /**
     * 
     * @param dtoVerstaendigungenABI
     * @return
     *     returns at.co.svc.soap.client.verstaendigungenAbfragen.DtoVerstaendigungenABO
     */
    @WebMethod(action = "verstaendigungenAbfragen")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verstaendigungenAbfragen", targetNamespace = "http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0", className = "at.co.svc.soap.client.verstaendigungenAbfragen.VerstaendigungenAbfragen_Type")
    @ResponseWrapper(localName = "verstaendigungenAbfragenResponse", targetNamespace = "http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0", className = "at.co.svc.soap.client.verstaendigungenAbfragen.VerstaendigungenAbfragenResponse")
    public DtoVerstaendigungenABO verstaendigungenAbfragen(
        @WebParam(name = "dtoVerstaendigungenABI", targetNamespace = "")
        DtoVerstaendigungenABI dtoVerstaendigungenABI);

}
