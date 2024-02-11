
package at.co.svc.soap.client.bpkLesen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoPersonKurz complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoPersonKurz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoPartnerKurz"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="titelVorneKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titelVorne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="familienname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="namensergaenzungKZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="namensergaenzung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titelHintenKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titelHinten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personenartKurz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personenart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geschlechtKZ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geschlecht" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bestaetigtesGeburtsDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="bkUnbestaetigtesGeburtsdatum" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}bkUnbestaetigtesGeburtsdatumVO" minOccurs="0"/&gt;
 *         &lt;element name="bkAmtlichesGeburtsdatum" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}bkAmtlichesGeburtsdatumVO" minOccurs="0"/&gt;
 *         &lt;element name="bestaetigtesTodesDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="unbestaetigtesTodesDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dtoPersonDiakritisch" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoPersonDiakritisch" minOccurs="0"/&gt;
 *         &lt;element name="isoA3Staatsbuergerschaft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familienstandKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoPersonKurz", propOrder = {
    "titelVorneKurz",
    "titelVorne",
    "vorname",
    "familienname",
    "namensergaenzungKZ",
    "namensergaenzung",
    "titelHintenKurz",
    "titelHinten",
    "personenartKurz",
    "personenart",
    "geschlechtKZ",
    "geschlecht",
    "bestaetigtesGeburtsDAT",
    "bkUnbestaetigtesGeburtsdatum",
    "bkAmtlichesGeburtsdatum",
    "bestaetigtesTodesDAT",
    "unbestaetigtesTodesDAT",
    "dtoPersonDiakritisch",
    "isoA3Staatsbuergerschaft",
    "familienstandKurz"
})
public class DtoPersonKurz
    extends DtoPartnerKurz
{

    protected String titelVorneKurz;
    protected String titelVorne;
    @XmlElement(required = true)
    protected String vorname;
    @XmlElement(required = true)
    protected String familienname;
    protected String namensergaenzungKZ;
    protected String namensergaenzung;
    protected String titelHintenKurz;
    protected String titelHinten;
    @XmlElement(required = true)
    protected String personenartKurz;
    @XmlElement(required = true)
    protected String personenart;
    @XmlElement(required = true)
    protected String geschlechtKZ;
    @XmlElement(required = true)
    protected String geschlecht;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bestaetigtesGeburtsDAT;
    protected BkUnbestaetigtesGeburtsdatumVO bkUnbestaetigtesGeburtsdatum;
    protected BkAmtlichesGeburtsdatumVO bkAmtlichesGeburtsdatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bestaetigtesTodesDAT;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar unbestaetigtesTodesDAT;
    protected DtoPersonDiakritisch dtoPersonDiakritisch;
    protected String isoA3Staatsbuergerschaft;
    protected String familienstandKurz;

    /**
     * Ruft den Wert der titelVorneKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelVorneKurz() {
        return titelVorneKurz;
    }

    /**
     * Legt den Wert der titelVorneKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelVorneKurz(String value) {
        this.titelVorneKurz = value;
    }

    /**
     * Ruft den Wert der titelVorne-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelVorne() {
        return titelVorne;
    }

    /**
     * Legt den Wert der titelVorne-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelVorne(String value) {
        this.titelVorne = value;
    }

    /**
     * Ruft den Wert der vorname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Legt den Wert der vorname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Ruft den Wert der familienname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilienname() {
        return familienname;
    }

    /**
     * Legt den Wert der familienname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilienname(String value) {
        this.familienname = value;
    }

    /**
     * Ruft den Wert der namensergaenzungKZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamensergaenzungKZ() {
        return namensergaenzungKZ;
    }

    /**
     * Legt den Wert der namensergaenzungKZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamensergaenzungKZ(String value) {
        this.namensergaenzungKZ = value;
    }

    /**
     * Ruft den Wert der namensergaenzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamensergaenzung() {
        return namensergaenzung;
    }

    /**
     * Legt den Wert der namensergaenzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamensergaenzung(String value) {
        this.namensergaenzung = value;
    }

    /**
     * Ruft den Wert der titelHintenKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelHintenKurz() {
        return titelHintenKurz;
    }

    /**
     * Legt den Wert der titelHintenKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelHintenKurz(String value) {
        this.titelHintenKurz = value;
    }

    /**
     * Ruft den Wert der titelHinten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelHinten() {
        return titelHinten;
    }

    /**
     * Legt den Wert der titelHinten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelHinten(String value) {
        this.titelHinten = value;
    }

    /**
     * Ruft den Wert der personenartKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonenartKurz() {
        return personenartKurz;
    }

    /**
     * Legt den Wert der personenartKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonenartKurz(String value) {
        this.personenartKurz = value;
    }

    /**
     * Ruft den Wert der personenart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonenart() {
        return personenart;
    }

    /**
     * Legt den Wert der personenart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonenart(String value) {
        this.personenart = value;
    }

    /**
     * Ruft den Wert der geschlechtKZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschlechtKZ() {
        return geschlechtKZ;
    }

    /**
     * Legt den Wert der geschlechtKZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschlechtKZ(String value) {
        this.geschlechtKZ = value;
    }

    /**
     * Ruft den Wert der geschlecht-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschlecht() {
        return geschlecht;
    }

    /**
     * Legt den Wert der geschlecht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschlecht(String value) {
        this.geschlecht = value;
    }

    /**
     * Ruft den Wert der bestaetigtesGeburtsDAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBestaetigtesGeburtsDAT() {
        return bestaetigtesGeburtsDAT;
    }

    /**
     * Legt den Wert der bestaetigtesGeburtsDAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBestaetigtesGeburtsDAT(XMLGregorianCalendar value) {
        this.bestaetigtesGeburtsDAT = value;
    }

    /**
     * Ruft den Wert der bkUnbestaetigtesGeburtsdatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BkUnbestaetigtesGeburtsdatumVO }
     *     
     */
    public BkUnbestaetigtesGeburtsdatumVO getBkUnbestaetigtesGeburtsdatum() {
        return bkUnbestaetigtesGeburtsdatum;
    }

    /**
     * Legt den Wert der bkUnbestaetigtesGeburtsdatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BkUnbestaetigtesGeburtsdatumVO }
     *     
     */
    public void setBkUnbestaetigtesGeburtsdatum(BkUnbestaetigtesGeburtsdatumVO value) {
        this.bkUnbestaetigtesGeburtsdatum = value;
    }

    /**
     * Ruft den Wert der bkAmtlichesGeburtsdatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BkAmtlichesGeburtsdatumVO }
     *     
     */
    public BkAmtlichesGeburtsdatumVO getBkAmtlichesGeburtsdatum() {
        return bkAmtlichesGeburtsdatum;
    }

    /**
     * Legt den Wert der bkAmtlichesGeburtsdatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BkAmtlichesGeburtsdatumVO }
     *     
     */
    public void setBkAmtlichesGeburtsdatum(BkAmtlichesGeburtsdatumVO value) {
        this.bkAmtlichesGeburtsdatum = value;
    }

    /**
     * Ruft den Wert der bestaetigtesTodesDAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBestaetigtesTodesDAT() {
        return bestaetigtesTodesDAT;
    }

    /**
     * Legt den Wert der bestaetigtesTodesDAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBestaetigtesTodesDAT(XMLGregorianCalendar value) {
        this.bestaetigtesTodesDAT = value;
    }

    /**
     * Ruft den Wert der unbestaetigtesTodesDAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnbestaetigtesTodesDAT() {
        return unbestaetigtesTodesDAT;
    }

    /**
     * Legt den Wert der unbestaetigtesTodesDAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnbestaetigtesTodesDAT(XMLGregorianCalendar value) {
        this.unbestaetigtesTodesDAT = value;
    }

    /**
     * Ruft den Wert der dtoPersonDiakritisch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoPersonDiakritisch }
     *     
     */
    public DtoPersonDiakritisch getDtoPersonDiakritisch() {
        return dtoPersonDiakritisch;
    }

    /**
     * Legt den Wert der dtoPersonDiakritisch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoPersonDiakritisch }
     *     
     */
    public void setDtoPersonDiakritisch(DtoPersonDiakritisch value) {
        this.dtoPersonDiakritisch = value;
    }

    /**
     * Ruft den Wert der isoA3Staatsbuergerschaft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoA3Staatsbuergerschaft() {
        return isoA3Staatsbuergerschaft;
    }

    /**
     * Legt den Wert der isoA3Staatsbuergerschaft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoA3Staatsbuergerschaft(String value) {
        this.isoA3Staatsbuergerschaft = value;
    }

    /**
     * Ruft den Wert der familienstandKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilienstandKurz() {
        return familienstandKurz;
    }

    /**
     * Legt den Wert der familienstandKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilienstandKurz(String value) {
        this.familienstandKurz = value;
    }

}
