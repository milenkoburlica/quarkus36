
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für bkStornoinformationVO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="bkStornoinformationVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stornoJN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stornogrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bkStornoinformationVO", propOrder = {
    "stornoJN",
    "stornogrund"
})
public class BkStornoinformationVO {

    @XmlElement(required = true)
    protected String stornoJN;
    protected String stornogrund;

    /**
     * Ruft den Wert der stornoJN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStornoJN() {
        return stornoJN;
    }

    /**
     * Legt den Wert der stornoJN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStornoJN(String value) {
        this.stornoJN = value;
    }

    /**
     * Ruft den Wert der stornogrund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStornogrund() {
        return stornogrund;
    }

    /**
     * Legt den Wert der stornogrund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStornogrund(String value) {
        this.stornogrund = value;
    }

}
