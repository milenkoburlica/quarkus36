
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZielpartnerCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UrsprungspartnerCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjektKennzeichen">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ListKennzeichen">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AenderungsdienstNummer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EingabeBestandsNummer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EingabeArt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TestKennzeichen" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZusaetzlOrdnungsbegriff">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenzNummer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BestandInhalt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BestandSigniert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestandVerschluesselt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestandKomprimiert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zielpartnerCode",
    "ursprungspartnerCode",
    "projektKennzeichen",
    "listKennzeichen",
    "erstellungsdatum",
    "aenderungsdienstNummer",
    "eingabeBestandsNummer",
    "eingabeArt",
    "testKennzeichen",
    "zusaetzlOrdnungsbegriff",
    "referenzNummer",
    "bestandInhalt",
    "bestandSigniert",
    "bestandVerschluesselt",
    "bestandKomprimiert"
})
@XmlRootElement(name = "MeldungsInfo")
public class MeldungsInfo {

    @XmlElement(name = "ZielpartnerCode", required = true)
    protected String zielpartnerCode;
    @XmlElement(name = "UrsprungspartnerCode", required = true)
    protected String ursprungspartnerCode;
    @XmlElement(name = "ProjektKennzeichen", required = true)
    protected String projektKennzeichen;
    @XmlElement(name = "ListKennzeichen", required = true)
    protected String listKennzeichen;
    @XmlElement(name = "Erstellungsdatum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    @XmlElement(name = "AenderungsdienstNummer")
    protected String aenderungsdienstNummer;
    @XmlElement(name = "EingabeBestandsNummer")
    protected String eingabeBestandsNummer;
    @XmlElement(name = "EingabeArt")
    protected String eingabeArt;
    @XmlElement(name = "TestKennzeichen")
    protected String testKennzeichen;
    @XmlElement(name = "ZusaetzlOrdnungsbegriff", required = true)
    protected String zusaetzlOrdnungsbegriff;
    @XmlElement(name = "ReferenzNummer")
    protected String referenzNummer;
    @XmlElement(name = "BestandInhalt")
    protected String bestandInhalt;
    @XmlElement(name = "BestandSigniert")
    protected Boolean bestandSigniert;
    @XmlElement(name = "BestandVerschluesselt")
    protected Boolean bestandVerschluesselt;
    @XmlElement(name = "BestandKomprimiert")
    protected Boolean bestandKomprimiert;

    /**
     * Ruft den Wert der zielpartnerCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZielpartnerCode() {
        return zielpartnerCode;
    }

    /**
     * Legt den Wert der zielpartnerCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZielpartnerCode(String value) {
        this.zielpartnerCode = value;
    }

    /**
     * Ruft den Wert der ursprungspartnerCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrsprungspartnerCode() {
        return ursprungspartnerCode;
    }

    /**
     * Legt den Wert der ursprungspartnerCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrsprungspartnerCode(String value) {
        this.ursprungspartnerCode = value;
    }

    /**
     * Ruft den Wert der projektKennzeichen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjektKennzeichen() {
        return projektKennzeichen;
    }

    /**
     * Legt den Wert der projektKennzeichen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjektKennzeichen(String value) {
        this.projektKennzeichen = value;
    }

    /**
     * Ruft den Wert der listKennzeichen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListKennzeichen() {
        return listKennzeichen;
    }

    /**
     * Legt den Wert der listKennzeichen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListKennzeichen(String value) {
        this.listKennzeichen = value;
    }

    /**
     * Ruft den Wert der erstellungsdatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Legt den Wert der erstellungsdatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstellungsdatum(XMLGregorianCalendar value) {
        this.erstellungsdatum = value;
    }

    /**
     * Ruft den Wert der aenderungsdienstNummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAenderungsdienstNummer() {
        return aenderungsdienstNummer;
    }

    /**
     * Legt den Wert der aenderungsdienstNummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAenderungsdienstNummer(String value) {
        this.aenderungsdienstNummer = value;
    }

    /**
     * Ruft den Wert der eingabeBestandsNummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEingabeBestandsNummer() {
        return eingabeBestandsNummer;
    }

    /**
     * Legt den Wert der eingabeBestandsNummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEingabeBestandsNummer(String value) {
        this.eingabeBestandsNummer = value;
    }

    /**
     * Ruft den Wert der eingabeArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEingabeArt() {
        return eingabeArt;
    }

    /**
     * Legt den Wert der eingabeArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEingabeArt(String value) {
        this.eingabeArt = value;
    }

    /**
     * Ruft den Wert der testKennzeichen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestKennzeichen() {
        return testKennzeichen;
    }

    /**
     * Legt den Wert der testKennzeichen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestKennzeichen(String value) {
        this.testKennzeichen = value;
    }

    /**
     * Ruft den Wert der zusaetzlOrdnungsbegriff-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusaetzlOrdnungsbegriff() {
        return zusaetzlOrdnungsbegriff;
    }

    /**
     * Legt den Wert der zusaetzlOrdnungsbegriff-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusaetzlOrdnungsbegriff(String value) {
        this.zusaetzlOrdnungsbegriff = value;
    }

    /**
     * Ruft den Wert der referenzNummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenzNummer() {
        return referenzNummer;
    }

    /**
     * Legt den Wert der referenzNummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenzNummer(String value) {
        this.referenzNummer = value;
    }

    /**
     * Ruft den Wert der bestandInhalt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestandInhalt() {
        return bestandInhalt;
    }

    /**
     * Legt den Wert der bestandInhalt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestandInhalt(String value) {
        this.bestandInhalt = value;
    }

    /**
     * Ruft den Wert der bestandSigniert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestandSigniert() {
        return bestandSigniert;
    }

    /**
     * Legt den Wert der bestandSigniert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestandSigniert(Boolean value) {
        this.bestandSigniert = value;
    }

    /**
     * Ruft den Wert der bestandVerschluesselt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestandVerschluesselt() {
        return bestandVerschluesselt;
    }

    /**
     * Legt den Wert der bestandVerschluesselt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestandVerschluesselt(Boolean value) {
        this.bestandVerschluesselt = value;
    }

    /**
     * Ruft den Wert der bestandKomprimiert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestandKomprimiert() {
        return bestandKomprimiert;
    }

    /**
     * Legt den Wert der bestandKomprimiert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestandKomprimiert(Boolean value) {
        this.bestandKomprimiert = value;
    }

}
