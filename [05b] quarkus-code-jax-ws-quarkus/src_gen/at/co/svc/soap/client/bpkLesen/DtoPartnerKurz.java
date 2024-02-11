
package at.co.svc.soap.client.bpkLesen;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoPartnerKurz complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoPartnerKurz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parParrolleID_Partner" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="partnerartKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="svbPKAktuellJN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stornoJN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auskunftssperreVorhandenJN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoPartnerKurz", propOrder = {
    "parParrolleIDPartner",
    "partnerartKurz",
    "svbPKAktuellJN",
    "stornoJN",
    "auskunftssperreVorhandenJN"
})
@XmlSeeAlso({
    DtoPersonKurz.class
})
public class DtoPartnerKurz {

    @XmlElement(name = "parParrolleID_Partner", required = true)
    protected BigInteger parParrolleIDPartner;
    protected String partnerartKurz;
    protected String svbPKAktuellJN;
    protected String stornoJN;
    protected String auskunftssperreVorhandenJN;

    /**
     * Ruft den Wert der parParrolleIDPartner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParParrolleIDPartner() {
        return parParrolleIDPartner;
    }

    /**
     * Legt den Wert der parParrolleIDPartner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParParrolleIDPartner(BigInteger value) {
        this.parParrolleIDPartner = value;
    }

    /**
     * Ruft den Wert der partnerartKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerartKurz() {
        return partnerartKurz;
    }

    /**
     * Legt den Wert der partnerartKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerartKurz(String value) {
        this.partnerartKurz = value;
    }

    /**
     * Ruft den Wert der svbPKAktuellJN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvbPKAktuellJN() {
        return svbPKAktuellJN;
    }

    /**
     * Legt den Wert der svbPKAktuellJN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvbPKAktuellJN(String value) {
        this.svbPKAktuellJN = value;
    }

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
     * Ruft den Wert der auskunftssperreVorhandenJN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuskunftssperreVorhandenJN() {
        return auskunftssperreVorhandenJN;
    }

    /**
     * Legt den Wert der auskunftssperreVorhandenJN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuskunftssperreVorhandenJN(String value) {
        this.auskunftssperreVorhandenJN = value;
    }

}
