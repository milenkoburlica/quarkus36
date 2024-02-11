
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoBearbeiter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoBearbeiter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="berechtigungsSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bearbeiterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgeinheitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoBearbeiter", propOrder = {
    "berechtigungsSystemId",
    "bearbeiterId",
    "meldendeStelle",
    "orgeinheitid"
})
public class DtoBearbeiter {

    @XmlElement(required = true)
    protected String berechtigungsSystemId;
    @XmlElement(required = true)
    protected String bearbeiterId;
    @XmlElement(required = true)
    protected String meldendeStelle;
    protected String orgeinheitid;

    /**
     * Ruft den Wert der berechtigungsSystemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerechtigungsSystemId() {
        return berechtigungsSystemId;
    }

    /**
     * Legt den Wert der berechtigungsSystemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerechtigungsSystemId(String value) {
        this.berechtigungsSystemId = value;
    }

    /**
     * Ruft den Wert der bearbeiterId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearbeiterId() {
        return bearbeiterId;
    }

    /**
     * Legt den Wert der bearbeiterId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearbeiterId(String value) {
        this.bearbeiterId = value;
    }

    /**
     * Ruft den Wert der meldendeStelle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldendeStelle() {
        return meldendeStelle;
    }

    /**
     * Legt den Wert der meldendeStelle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldendeStelle(String value) {
        this.meldendeStelle = value;
    }

    /**
     * Ruft den Wert der orgeinheitid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgeinheitid() {
        return orgeinheitid;
    }

    /**
     * Legt den Wert der orgeinheitid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgeinheitid(String value) {
        this.orgeinheitid = value;
    }

}
