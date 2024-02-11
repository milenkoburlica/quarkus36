
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtObPKLEI complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtObPKLEI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bpkBereichKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="svbPKVerschluesseltJN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bkStatusKZ" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}bkStatusKZVO"/&gt;
 *         &lt;element name="partnerDiakritischJN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bearbeiterinfoJN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnerrollenartKurzAnforderung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtoPartnerParrolleIdentifikation" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoPartnerParrolleIdentifikation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtObPKLEI", propOrder = {
    "bpkBereichKurz",
    "svbPKVerschluesseltJN",
    "bkStatusKZ",
    "partnerDiakritischJN",
    "bearbeiterinfoJN",
    "partnerrollenartKurzAnforderung",
    "dtoPartnerParrolleIdentifikation"
})
public class DtObPKLEI {

    protected String bpkBereichKurz;
    protected String svbPKVerschluesseltJN;
    @XmlElement(required = true)
    protected BkStatusKZVO bkStatusKZ;
    @XmlElement(required = true)
    protected String partnerDiakritischJN;
    @XmlElement(required = true)
    protected String bearbeiterinfoJN;
    protected String partnerrollenartKurzAnforderung;
    @XmlElement(required = true)
    protected DtoPartnerParrolleIdentifikation dtoPartnerParrolleIdentifikation;

    /**
     * Ruft den Wert der bpkBereichKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpkBereichKurz() {
        return bpkBereichKurz;
    }

    /**
     * Legt den Wert der bpkBereichKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpkBereichKurz(String value) {
        this.bpkBereichKurz = value;
    }

    /**
     * Ruft den Wert der svbPKVerschluesseltJN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvbPKVerschluesseltJN() {
        return svbPKVerschluesseltJN;
    }

    /**
     * Legt den Wert der svbPKVerschluesseltJN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvbPKVerschluesseltJN(String value) {
        this.svbPKVerschluesseltJN = value;
    }

    /**
     * Ruft den Wert der bkStatusKZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BkStatusKZVO }
     *     
     */
    public BkStatusKZVO getBkStatusKZ() {
        return bkStatusKZ;
    }

    /**
     * Legt den Wert der bkStatusKZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BkStatusKZVO }
     *     
     */
    public void setBkStatusKZ(BkStatusKZVO value) {
        this.bkStatusKZ = value;
    }

    /**
     * Ruft den Wert der partnerDiakritischJN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerDiakritischJN() {
        return partnerDiakritischJN;
    }

    /**
     * Legt den Wert der partnerDiakritischJN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerDiakritischJN(String value) {
        this.partnerDiakritischJN = value;
    }

    /**
     * Ruft den Wert der bearbeiterinfoJN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearbeiterinfoJN() {
        return bearbeiterinfoJN;
    }

    /**
     * Legt den Wert der bearbeiterinfoJN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearbeiterinfoJN(String value) {
        this.bearbeiterinfoJN = value;
    }

    /**
     * Ruft den Wert der partnerrollenartKurzAnforderung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerrollenartKurzAnforderung() {
        return partnerrollenartKurzAnforderung;
    }

    /**
     * Legt den Wert der partnerrollenartKurzAnforderung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerrollenartKurzAnforderung(String value) {
        this.partnerrollenartKurzAnforderung = value;
    }

    /**
     * Ruft den Wert der dtoPartnerParrolleIdentifikation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoPartnerParrolleIdentifikation }
     *     
     */
    public DtoPartnerParrolleIdentifikation getDtoPartnerParrolleIdentifikation() {
        return dtoPartnerParrolleIdentifikation;
    }

    /**
     * Legt den Wert der dtoPartnerParrolleIdentifikation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoPartnerParrolleIdentifikation }
     *     
     */
    public void setDtoPartnerParrolleIdentifikation(DtoPartnerParrolleIdentifikation value) {
        this.dtoPartnerParrolleIdentifikation = value;
    }

}
