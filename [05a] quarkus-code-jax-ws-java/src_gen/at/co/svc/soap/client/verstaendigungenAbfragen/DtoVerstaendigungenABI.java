
package at.co.svc.soap.client.verstaendigungenAbfragen;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoVerstaendigungenABI complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoVerstaendigungenABI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoInput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="letzteBekannteVerstaendigungsnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dtoVerstaendigungsEmpfaenger" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoVerstaendigungsEmpfaenger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoVerstaendigungenABI", propOrder = {
    "letzteBekannteVerstaendigungsnummer",
    "dtoVerstaendigungsEmpfaenger"
})
public class DtoVerstaendigungenABI
    extends DtoInput
{

    @XmlElement(required = true)
    protected BigInteger letzteBekannteVerstaendigungsnummer;
    @XmlElement(required = true)
    protected DtoVerstaendigungsEmpfaenger dtoVerstaendigungsEmpfaenger;

    /**
     * Ruft den Wert der letzteBekannteVerstaendigungsnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLetzteBekannteVerstaendigungsnummer() {
        return letzteBekannteVerstaendigungsnummer;
    }

    /**
     * Legt den Wert der letzteBekannteVerstaendigungsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLetzteBekannteVerstaendigungsnummer(BigInteger value) {
        this.letzteBekannteVerstaendigungsnummer = value;
    }

    /**
     * Ruft den Wert der dtoVerstaendigungsEmpfaenger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoVerstaendigungsEmpfaenger }
     *     
     */
    public DtoVerstaendigungsEmpfaenger getDtoVerstaendigungsEmpfaenger() {
        return dtoVerstaendigungsEmpfaenger;
    }

    /**
     * Legt den Wert der dtoVerstaendigungsEmpfaenger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoVerstaendigungsEmpfaenger }
     *     
     */
    public void setDtoVerstaendigungsEmpfaenger(DtoVerstaendigungsEmpfaenger value) {
        this.dtoVerstaendigungsEmpfaenger = value;
    }

}
