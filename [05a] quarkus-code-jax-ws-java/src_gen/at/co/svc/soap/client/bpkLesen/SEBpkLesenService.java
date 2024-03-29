
package at.co.svc.soap.client.bpkLesen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "SEBpkLesenService", targetNamespace = "http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0", wsdlLocation = "file:/C:/tmp/learn_quarkus/%5B05a%5D%20quarkus-code-jax-ws-java/src/main/resources/wsdl/SEBpkLesen.wsdl")
public class SEBpkLesenService
    extends Service
{

    private final static URL SEBPKLESENSERVICE_WSDL_LOCATION;
    private final static WebServiceException SEBPKLESENSERVICE_EXCEPTION;
    private final static QName SEBPKLESENSERVICE_QNAME = new QName("http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0", "SEBpkLesenService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/tmp/learn_quarkus/%5B05a%5D%20quarkus-code-jax-ws-java/src/main/resources/wsdl/SEBpkLesen.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SEBPKLESENSERVICE_WSDL_LOCATION = url;
        SEBPKLESENSERVICE_EXCEPTION = e;
    }

    public SEBpkLesenService() {
        super(__getWsdlLocation(), SEBPKLESENSERVICE_QNAME);
    }

    public SEBpkLesenService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SEBPKLESENSERVICE_QNAME, features);
    }

    public SEBpkLesenService(URL wsdlLocation) {
        super(wsdlLocation, SEBPKLESENSERVICE_QNAME);
    }

    public SEBpkLesenService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SEBPKLESENSERVICE_QNAME, features);
    }

    public SEBpkLesenService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SEBpkLesenService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BpkLesen
     */
    @WebEndpoint(name = "BpkLesenPort")
    public BpkLesen getBpkLesenPort() {
        return super.getPort(new QName("http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0", "BpkLesenPort"), BpkLesen.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BpkLesen
     */
    @WebEndpoint(name = "BpkLesenPort")
    public BpkLesen getBpkLesenPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0", "BpkLesenPort"), BpkLesen.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEBPKLESENSERVICE_EXCEPTION!= null) {
            throw SEBPKLESENSERVICE_EXCEPTION;
        }
        return SEBPKLESENSERVICE_WSDL_LOCATION;
    }

}
