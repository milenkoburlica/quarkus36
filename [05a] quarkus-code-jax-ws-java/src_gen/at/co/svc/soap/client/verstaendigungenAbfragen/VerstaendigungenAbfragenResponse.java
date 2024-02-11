
package at.co.svc.soap.client.verstaendigungenAbfragen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für verstaendigungenAbfragenResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="verstaendigungenAbfragenResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoVerstaendigungenABO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verstaendigungenAbfragenResponse", propOrder = {
    "_return"
})
public class VerstaendigungenAbfragenResponse {

    @XmlElement(name = "return")
    protected DtoVerstaendigungenABO _return;

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoVerstaendigungenABO }
     *     
     */
    public DtoVerstaendigungenABO getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoVerstaendigungenABO }
     *     
     */
    public void setReturn(DtoVerstaendigungenABO value) {
        this._return = value;
    }

}
