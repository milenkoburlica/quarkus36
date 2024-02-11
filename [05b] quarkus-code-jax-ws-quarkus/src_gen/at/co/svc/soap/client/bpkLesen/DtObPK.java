
package at.co.svc.soap.client.bpkLesen;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtObPK complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtObPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bpkID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="bpk_unverschluesselt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bpk_verschluesselt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bpkBereichKurz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bpkBereich" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bkGueltigkeitszeitraum" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}bkGueltigkeitszeitraumVO"/&gt;
 *         &lt;element name="bkStornoinformation" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}bkStornoinformationVO"/&gt;
 *         &lt;element name="updatecount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dtoBearbeiterinformation" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoBearbeiterinformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtObPK", propOrder = {
    "bpkID",
    "bpkUnverschluesselt",
    "bpkVerschluesselt",
    "bpkBereichKurz",
    "bpkBereich",
    "bkGueltigkeitszeitraum",
    "bkStornoinformation",
    "updatecount",
    "dtoBearbeiterinformation"
})
public class DtObPK {

    @XmlElement(required = true)
    protected BigInteger bpkID;
    @XmlElement(name = "bpk_unverschluesselt")
    protected String bpkUnverschluesselt;
    @XmlElement(name = "bpk_verschluesselt")
    protected String bpkVerschluesselt;
    @XmlElement(required = true)
    protected String bpkBereichKurz;
    @XmlElement(required = true)
    protected String bpkBereich;
    @XmlElement(required = true)
    protected BkGueltigkeitszeitraumVO bkGueltigkeitszeitraum;
    @XmlElement(required = true)
    protected BkStornoinformationVO bkStornoinformation;
    @XmlElement(required = true)
    protected BigInteger updatecount;
    protected DtoBearbeiterinformation dtoBearbeiterinformation;

    /**
     * Ruft den Wert der bpkID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBpkID() {
        return bpkID;
    }

    /**
     * Legt den Wert der bpkID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBpkID(BigInteger value) {
        this.bpkID = value;
    }

    /**
     * Ruft den Wert der bpkUnverschluesselt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpkUnverschluesselt() {
        return bpkUnverschluesselt;
    }

    /**
     * Legt den Wert der bpkUnverschluesselt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpkUnverschluesselt(String value) {
        this.bpkUnverschluesselt = value;
    }

    /**
     * Ruft den Wert der bpkVerschluesselt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpkVerschluesselt() {
        return bpkVerschluesselt;
    }

    /**
     * Legt den Wert der bpkVerschluesselt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpkVerschluesselt(String value) {
        this.bpkVerschluesselt = value;
    }

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
     * Ruft den Wert der bpkBereich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpkBereich() {
        return bpkBereich;
    }

    /**
     * Legt den Wert der bpkBereich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpkBereich(String value) {
        this.bpkBereich = value;
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
     * Ruft den Wert der bkStornoinformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BkStornoinformationVO }
     *     
     */
    public BkStornoinformationVO getBkStornoinformation() {
        return bkStornoinformation;
    }

    /**
     * Legt den Wert der bkStornoinformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BkStornoinformationVO }
     *     
     */
    public void setBkStornoinformation(BkStornoinformationVO value) {
        this.bkStornoinformation = value;
    }

    /**
     * Ruft den Wert der updatecount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpdatecount() {
        return updatecount;
    }

    /**
     * Legt den Wert der updatecount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpdatecount(BigInteger value) {
        this.updatecount = value;
    }

    /**
     * Ruft den Wert der dtoBearbeiterinformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoBearbeiterinformation }
     *     
     */
    public DtoBearbeiterinformation getDtoBearbeiterinformation() {
        return dtoBearbeiterinformation;
    }

    /**
     * Legt den Wert der dtoBearbeiterinformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoBearbeiterinformation }
     *     
     */
    public void setDtoBearbeiterinformation(DtoBearbeiterinformation value) {
        this.dtoBearbeiterinformation = value;
    }

}
