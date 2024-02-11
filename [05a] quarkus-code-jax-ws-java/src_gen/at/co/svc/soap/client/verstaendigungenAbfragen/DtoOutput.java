
package at.co.svc.soap.client.verstaendigungenAbfragen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoOutput complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fehlerpaket" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}returnInfo"/&gt;
 *         &lt;element name="dtoResponseHeader" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoResponseHeader"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoOutput", propOrder = {
    "fehlerpaket",
    "dtoResponseHeader"
})
@XmlSeeAlso({
    DtoVerstaendigungenABO.class
})
public class DtoOutput {

    @XmlElement(required = true)
    protected ReturnInfo fehlerpaket;
    @XmlElement(required = true)
    protected DtoResponseHeader dtoResponseHeader;

    /**
     * Ruft den Wert der fehlerpaket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInfo }
     *     
     */
    public ReturnInfo getFehlerpaket() {
        return fehlerpaket;
    }

    /**
     * Legt den Wert der fehlerpaket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInfo }
     *     
     */
    public void setFehlerpaket(ReturnInfo value) {
        this.fehlerpaket = value;
    }

    /**
     * Ruft den Wert der dtoResponseHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoResponseHeader }
     *     
     */
    public DtoResponseHeader getDtoResponseHeader() {
        return dtoResponseHeader;
    }

    /**
     * Legt den Wert der dtoResponseHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoResponseHeader }
     *     
     */
    public void setDtoResponseHeader(DtoResponseHeader value) {
        this.dtoResponseHeader = value;
    }

}
