
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoInput complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoRequestHeader" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoRequestHeader"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoInput", propOrder = {
    "dtoRequestHeader"
})
@XmlSeeAlso({
    DtObPKListeLEI.class
})
public class DtoInput {

    @XmlElement(required = true)
    protected DtoRequestHeader dtoRequestHeader;

    /**
     * Ruft den Wert der dtoRequestHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoRequestHeader }
     *     
     */
    public DtoRequestHeader getDtoRequestHeader() {
        return dtoRequestHeader;
    }

    /**
     * Legt den Wert der dtoRequestHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoRequestHeader }
     *     
     */
    public void setDtoRequestHeader(DtoRequestHeader value) {
        this.dtoRequestHeader = value;
    }

}
