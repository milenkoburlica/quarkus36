
package at.co.svc.soap.client.verstaendigungenAbfragen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für verstaendigungenAbfragen complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="verstaendigungenAbfragen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoVerstaendigungenABI" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoVerstaendigungenABI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verstaendigungenAbfragen", propOrder = {
    "dtoVerstaendigungenABI"
})
public class VerstaendigungenAbfragen_Type {

    protected DtoVerstaendigungenABI dtoVerstaendigungenABI;

    /**
     * Ruft den Wert der dtoVerstaendigungenABI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoVerstaendigungenABI }
     *     
     */
    public DtoVerstaendigungenABI getDtoVerstaendigungenABI() {
        return dtoVerstaendigungenABI;
    }

    /**
     * Legt den Wert der dtoVerstaendigungenABI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoVerstaendigungenABI }
     *     
     */
    public void setDtoVerstaendigungenABI(DtoVerstaendigungenABI value) {
        this.dtoVerstaendigungenABI = value;
    }

}
