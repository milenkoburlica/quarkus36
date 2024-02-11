
package at.co.svc.soap.client.verstaendigungenAbfragen;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.co.svc.soap.client.verstaendigungenAbfragen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerstaendigungenAbfragen_QNAME = new QName("http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0", "verstaendigungenAbfragen");
    private final static QName _VerstaendigungenAbfragenResponse_QNAME = new QName("http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0", "verstaendigungenAbfragenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.co.svc.soap.client.verstaendigungenAbfragen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerstaendigungenAbfragen_Type }
     * 
     */
    public VerstaendigungenAbfragen_Type createVerstaendigungenAbfragen_Type() {
        return new VerstaendigungenAbfragen_Type();
    }

    /**
     * Create an instance of {@link VerstaendigungenAbfragenResponse }
     * 
     */
    public VerstaendigungenAbfragenResponse createVerstaendigungenAbfragenResponse() {
        return new VerstaendigungenAbfragenResponse();
    }

    /**
     * Create an instance of {@link DtoVerstaendigungenABI }
     * 
     */
    public DtoVerstaendigungenABI createDtoVerstaendigungenABI() {
        return new DtoVerstaendigungenABI();
    }

    /**
     * Create an instance of {@link DtoInput }
     * 
     */
    public DtoInput createDtoInput() {
        return new DtoInput();
    }

    /**
     * Create an instance of {@link DtoVerstaendigungsEmpfaenger }
     * 
     */
    public DtoVerstaendigungsEmpfaenger createDtoVerstaendigungsEmpfaenger() {
        return new DtoVerstaendigungsEmpfaenger();
    }

    /**
     * Create an instance of {@link DtoRequestHeader }
     * 
     */
    public DtoRequestHeader createDtoRequestHeader() {
        return new DtoRequestHeader();
    }

    /**
     * Create an instance of {@link DtoQuellsystem }
     * 
     */
    public DtoQuellsystem createDtoQuellsystem() {
        return new DtoQuellsystem();
    }

    /**
     * Create an instance of {@link DtoKontextRQ }
     * 
     */
    public DtoKontextRQ createDtoKontextRQ() {
        return new DtoKontextRQ();
    }

    /**
     * Create an instance of {@link DtoBearbeiter }
     * 
     */
    public DtoBearbeiter createDtoBearbeiter() {
        return new DtoBearbeiter();
    }

    /**
     * Create an instance of {@link DtoZielsystem }
     * 
     */
    public DtoZielsystem createDtoZielsystem() {
        return new DtoZielsystem();
    }

    /**
     * Create an instance of {@link DtoVerstaendigungenABO }
     * 
     */
    public DtoVerstaendigungenABO createDtoVerstaendigungenABO() {
        return new DtoVerstaendigungenABO();
    }

    /**
     * Create an instance of {@link DtoOutput }
     * 
     */
    public DtoOutput createDtoOutput() {
        return new DtoOutput();
    }

    /**
     * Create an instance of {@link DtoVerstaendigung }
     * 
     */
    public DtoVerstaendigung createDtoVerstaendigung() {
        return new DtoVerstaendigung();
    }

    /**
     * Create an instance of {@link DtoBearbeiterinformation }
     * 
     */
    public DtoBearbeiterinformation createDtoBearbeiterinformation() {
        return new DtoBearbeiterinformation();
    }

    /**
     * Create an instance of {@link ReturnInfo }
     * 
     */
    public ReturnInfo createReturnInfo() {
        return new ReturnInfo();
    }

    /**
     * Create an instance of {@link Meldung }
     * 
     */
    public Meldung createMeldung() {
        return new Meldung();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link DtoResponseHeader }
     * 
     */
    public DtoResponseHeader createDtoResponseHeader() {
        return new DtoResponseHeader();
    }

    /**
     * Create an instance of {@link DtoKontextRS }
     * 
     */
    public DtoKontextRS createDtoKontextRS() {
        return new DtoKontextRS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerstaendigungenAbfragen_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerstaendigungenAbfragen_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0", name = "verstaendigungenAbfragen")
    public JAXBElement<VerstaendigungenAbfragen_Type> createVerstaendigungenAbfragen(VerstaendigungenAbfragen_Type value) {
        return new JAXBElement<VerstaendigungenAbfragen_Type>(_VerstaendigungenAbfragen_QNAME, VerstaendigungenAbfragen_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerstaendigungenAbfragenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerstaendigungenAbfragenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0", name = "verstaendigungenAbfragenResponse")
    public JAXBElement<VerstaendigungenAbfragenResponse> createVerstaendigungenAbfragenResponse(VerstaendigungenAbfragenResponse value) {
        return new JAXBElement<VerstaendigungenAbfragenResponse>(_VerstaendigungenAbfragenResponse_QNAME, VerstaendigungenAbfragenResponse.class, null, value);
    }

}
