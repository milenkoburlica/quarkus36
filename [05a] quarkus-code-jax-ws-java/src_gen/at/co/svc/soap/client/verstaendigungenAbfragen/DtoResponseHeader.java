
package at.co.svc.soap.client.verstaendigungenAbfragen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoResponseHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoKontextRS" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoKontextRS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoResponseHeader", propOrder = {
    "dtoKontextRS"
})
public class DtoResponseHeader {

    @XmlElement(required = true)
    protected DtoKontextRS dtoKontextRS;

    /**
     * Ruft den Wert der dtoKontextRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoKontextRS }
     *     
     */
    public DtoKontextRS getDtoKontextRS() {
        return dtoKontextRS;
    }

    /**
     * Legt den Wert der dtoKontextRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoKontextRS }
     *     
     */
    public void setDtoKontextRS(DtoKontextRS value) {
        this.dtoKontextRS = value;
    }

}
