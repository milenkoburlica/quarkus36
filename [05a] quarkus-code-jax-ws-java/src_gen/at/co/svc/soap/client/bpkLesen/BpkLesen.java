
package at.co.svc.soap.client.bpkLesen;

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
@WebService(name = "BpkLesen", targetNamespace = "http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BpkLesen {


    /**
     * 
     * @param dtobPKListeLEI
     * @return
     *     returns at.co.svc.soap.client.bpkLesen.DtObPKListeLEO
     */
    @WebMethod(action = "bPkLesen")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bPkLesen", targetNamespace = "http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0", className = "at.co.svc.soap.client.bpkLesen.BPkLesenType")
    @ResponseWrapper(localName = "bPkLesenResponse", targetNamespace = "http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0", className = "at.co.svc.soap.client.bpkLesen.BPkLesenResponse")
    public DtObPKListeLEO bPkLesen(
        @WebParam(name = "dtobPKListeLEI", targetNamespace = "")
        DtObPKListeLEI dtobPKListeLEI);

}
