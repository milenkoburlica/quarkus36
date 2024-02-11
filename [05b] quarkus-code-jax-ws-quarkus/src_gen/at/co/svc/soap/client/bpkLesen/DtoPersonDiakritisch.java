
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoPersonDiakritisch complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoPersonDiakritisch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="titelVorneDiakritisch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titelHintenDiakritisch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vornameDiakritisch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="familiennameDiakritisch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geburtsnameDiakritisch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoPersonDiakritisch", propOrder = {
    "titelVorneDiakritisch",
    "titelHintenDiakritisch",
    "vornameDiakritisch",
    "familiennameDiakritisch",
    "geburtsnameDiakritisch"
})
public class DtoPersonDiakritisch {

    protected String titelVorneDiakritisch;
    protected String titelHintenDiakritisch;
    @XmlElement(required = true)
    protected String vornameDiakritisch;
    @XmlElement(required = true)
    protected String familiennameDiakritisch;
    protected String geburtsnameDiakritisch;

    /**
     * Ruft den Wert der titelVorneDiakritisch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelVorneDiakritisch() {
        return titelVorneDiakritisch;
    }

    /**
     * Legt den Wert der titelVorneDiakritisch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelVorneDiakritisch(String value) {
        this.titelVorneDiakritisch = value;
    }

    /**
     * Ruft den Wert der titelHintenDiakritisch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelHintenDiakritisch() {
        return titelHintenDiakritisch;
    }

    /**
     * Legt den Wert der titelHintenDiakritisch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelHintenDiakritisch(String value) {
        this.titelHintenDiakritisch = value;
    }

    /**
     * Ruft den Wert der vornameDiakritisch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVornameDiakritisch() {
        return vornameDiakritisch;
    }

    /**
     * Legt den Wert der vornameDiakritisch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVornameDiakritisch(String value) {
        this.vornameDiakritisch = value;
    }

    /**
     * Ruft den Wert der familiennameDiakritisch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamiliennameDiakritisch() {
        return familiennameDiakritisch;
    }

    /**
     * Legt den Wert der familiennameDiakritisch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamiliennameDiakritisch(String value) {
        this.familiennameDiakritisch = value;
    }

    /**
     * Ruft den Wert der geburtsnameDiakritisch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeburtsnameDiakritisch() {
        return geburtsnameDiakritisch;
    }

    /**
     * Legt den Wert der geburtsnameDiakritisch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeburtsnameDiakritisch(String value) {
        this.geburtsnameDiakritisch = value;
    }

}
