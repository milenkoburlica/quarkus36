
package at.co.svc.soap.client.bpkLesen;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoPartnerrolleKurz complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoPartnerrolleKurz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parParrolleID_Partnerrolle" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="partnerrollenartKurz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnerrollenart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fachschluesselartKurzbez" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fsPartnerrolle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bkGueltigkeitszeitraum" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}bkGueltigkeitszeitraumVO"/&gt;
 *         &lt;element name="stornoJN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoPartnerrolleKurz", propOrder = {
    "parParrolleIDPartnerrolle",
    "partnerrollenartKurz",
    "partnerrollenart",
    "fachschluesselartKurzbez",
    "fsPartnerrolle",
    "bkGueltigkeitszeitraum",
    "stornoJN"
})
public class DtoPartnerrolleKurz {

    @XmlElement(name = "parParrolleID_Partnerrolle", required = true)
    protected BigInteger parParrolleIDPartnerrolle;
    @XmlElement(required = true)
    protected String partnerrollenartKurz;
    @XmlElement(required = true)
    protected String partnerrollenart;
    @XmlElement(required = true)
    protected String fachschluesselartKurzbez;
    @XmlElement(required = true)
    protected String fsPartnerrolle;
    @XmlElement(required = true)
    protected BkGueltigkeitszeitraumVO bkGueltigkeitszeitraum;
    @XmlElement(required = true)
    protected String stornoJN;

    /**
     * Ruft den Wert der parParrolleIDPartnerrolle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParParrolleIDPartnerrolle() {
        return parParrolleIDPartnerrolle;
    }

    /**
     * Legt den Wert der parParrolleIDPartnerrolle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParParrolleIDPartnerrolle(BigInteger value) {
        this.parParrolleIDPartnerrolle = value;
    }

    /**
     * Ruft den Wert der partnerrollenartKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerrollenartKurz() {
        return partnerrollenartKurz;
    }

    /**
     * Legt den Wert der partnerrollenartKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerrollenartKurz(String value) {
        this.partnerrollenartKurz = value;
    }

    /**
     * Ruft den Wert der partnerrollenart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerrollenart() {
        return partnerrollenart;
    }

    /**
     * Legt den Wert der partnerrollenart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerrollenart(String value) {
        this.partnerrollenart = value;
    }

    /**
     * Ruft den Wert der fachschluesselartKurzbez-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFachschluesselartKurzbez() {
        return fachschluesselartKurzbez;
    }

    /**
     * Legt den Wert der fachschluesselartKurzbez-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFachschluesselartKurzbez(String value) {
        this.fachschluesselartKurzbez = value;
    }

    /**
     * Ruft den Wert der fsPartnerrolle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsPartnerrolle() {
        return fsPartnerrolle;
    }

    /**
     * Legt den Wert der fsPartnerrolle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsPartnerrolle(String value) {
        this.fsPartnerrolle = value;
    }

    /**
     * Ruft den Wert der bkGueltigkeitszeitraum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BkGueltigkeitszeitraumVO }
     *     
     */
    public BkGueltigkeitszeitraumVO getBkGueltigkeitszeitraum() {
        return bkGueltigkeitszeitraum;
    }

    /**
     * Legt den Wert der bkGueltigkeitszeitraum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BkGueltigkeitszeitraumVO }
     *     
     */
    public void setBkGueltigkeitszeitraum(BkGueltigkeitszeitraumVO value) {
        this.bkGueltigkeitszeitraum = value;
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

}
