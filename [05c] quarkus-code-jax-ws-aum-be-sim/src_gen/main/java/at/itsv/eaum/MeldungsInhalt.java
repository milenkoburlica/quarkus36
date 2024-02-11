
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
 *         &lt;element name="meldungsId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="meldungsArt" type="{http://www.itsv.at/eAUM/}MeldungsArt"/>
 *         &lt;element name="vpnr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="10"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vstrl">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="person" type="{http://www.itsv.at/eAUM/}AllgemeinePerson"/>
 *         &lt;element name="erstellungsDat" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="aubeginnDat" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="auendeDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="afmelderTyp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="anstaltAufenthalt" type="{http://www.itsv.at/eAUM/}Anstaltsaufenthalt" minOccurs="0"/>
 *         &lt;element name="diagnose" type="{http://www.itsv.at/eAUM/}Diagnose"/>
 *         &lt;element name="erkrankungTyp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auEreignis" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="stromUnfall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="infoAnm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ausgangZeit1" type="{http://www.itsv.at/eAUM/}Ausgangszeit" minOccurs="0"/>
 *         &lt;element name="ausgangZeit2" type="{http://www.itsv.at/eAUM/}Ausgangszeit" minOccurs="0"/>
 *         &lt;element name="bettruhe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gehunfaehigBisDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="gipsBisDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="wiederbestellDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="voraussauendeDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auAdresse" type="{http://www.itsv.at/eAUM/}Adresse" minOccurs="0"/>
 *         &lt;element name="rueckDatGrund" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="berufsUnfaehig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="behBeginnDat" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "meldungsId",
    "meldungsArt",
    "vpnr",
    "vstrl",
    "person",
    "erstellungsDat",
    "aubeginnDat",
    "auendeDat",
    "afmelderTyp",
    "anstaltAufenthalt",
    "diagnose",
    "erkrankungTyp",
    "auEreignis",
    "stromUnfall",
    "infoAnm",
    "ausgangZeit1",
    "ausgangZeit2",
    "bettruhe",
    "gehunfaehigBisDat",
    "gipsBisDat",
    "wiederbestellDat",
    "voraussauendeDat",
    "auAdresse",
    "rueckDatGrund",
    "berufsUnfaehig",
    "behBeginnDat"
})
@XmlRootElement(name = "MeldungsInhalt")
public class MeldungsInhalt {

    @XmlElement(required = true)
    protected String meldungsId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MeldungsArt meldungsArt;
    @XmlElement(required = true)
    protected String vpnr;
    @XmlElement(required = true)
    protected String vstrl;
    @XmlElement(required = true)
    protected AllgemeinePerson person;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsDat;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aubeginnDat;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar auendeDat;
    protected String afmelderTyp;
    protected Anstaltsaufenthalt anstaltAufenthalt;
    @XmlElement(required = true)
    protected Diagnose diagnose;
    protected String erkrankungTyp;
    protected String auEreignis;
    protected Boolean stromUnfall;
    protected String infoAnm;
    protected Ausgangszeit ausgangZeit1;
    protected Ausgangszeit ausgangZeit2;
    protected Boolean bettruhe;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gehunfaehigBisDat;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gipsBisDat;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar wiederbestellDat;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar voraussauendeDat;
    protected Adresse auAdresse;
    protected String rueckDatGrund;
    protected Boolean berufsUnfaehig;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar behBeginnDat;

    /**
     * Ruft den Wert der meldungsId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldungsId() {
        return meldungsId;
    }

    /**
     * Legt den Wert der meldungsId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldungsId(String value) {
        this.meldungsId = value;
    }

    /**
     * Ruft den Wert der meldungsArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeldungsArt }
     *     
     */
    public MeldungsArt getMeldungsArt() {
        return meldungsArt;
    }

    /**
     * Legt den Wert der meldungsArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungsArt }
     *     
     */
    public void setMeldungsArt(MeldungsArt value) {
        this.meldungsArt = value;
    }

    /**
     * Ruft den Wert der vpnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnr() {
        return vpnr;
    }

    /**
     * Legt den Wert der vpnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnr(String value) {
        this.vpnr = value;
    }

    /**
     * Ruft den Wert der vstrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVstrl() {
        return vstrl;
    }

    /**
     * Legt den Wert der vstrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVstrl(String value) {
        this.vstrl = value;
    }

    /**
     * Ruft den Wert der person-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllgemeinePerson }
     *     
     */
    public AllgemeinePerson getPerson() {
        return person;
    }

    /**
     * Legt den Wert der person-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllgemeinePerson }
     *     
     */
    public void setPerson(AllgemeinePerson value) {
        this.person = value;
    }

    /**
     * Ruft den Wert der erstellungsDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstellungsDat() {
        return erstellungsDat;
    }

    /**
     * Legt den Wert der erstellungsDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstellungsDat(XMLGregorianCalendar value) {
        this.erstellungsDat = value;
    }

    /**
     * Ruft den Wert der aubeginnDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAubeginnDat() {
        return aubeginnDat;
    }

    /**
     * Legt den Wert der aubeginnDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAubeginnDat(XMLGregorianCalendar value) {
        this.aubeginnDat = value;
    }

    /**
     * Ruft den Wert der auendeDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuendeDat() {
        return auendeDat;
    }

    /**
     * Legt den Wert der auendeDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuendeDat(XMLGregorianCalendar value) {
        this.auendeDat = value;
    }

    /**
     * Ruft den Wert der afmelderTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfmelderTyp() {
        return afmelderTyp;
    }

    /**
     * Legt den Wert der afmelderTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfmelderTyp(String value) {
        this.afmelderTyp = value;
    }

    /**
     * Ruft den Wert der anstaltAufenthalt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Anstaltsaufenthalt }
     *     
     */
    public Anstaltsaufenthalt getAnstaltAufenthalt() {
        return anstaltAufenthalt;
    }

    /**
     * Legt den Wert der anstaltAufenthalt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstaltsaufenthalt }
     *     
     */
    public void setAnstaltAufenthalt(Anstaltsaufenthalt value) {
        this.anstaltAufenthalt = value;
    }

    /**
     * Ruft den Wert der diagnose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Diagnose }
     *     
     */
    public Diagnose getDiagnose() {
        return diagnose;
    }

    /**
     * Legt den Wert der diagnose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagnose }
     *     
     */
    public void setDiagnose(Diagnose value) {
        this.diagnose = value;
    }

    /**
     * Ruft den Wert der erkrankungTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErkrankungTyp() {
        return erkrankungTyp;
    }

    /**
     * Legt den Wert der erkrankungTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErkrankungTyp(String value) {
        this.erkrankungTyp = value;
    }

    /**
     * Ruft den Wert der auEreignis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuEreignis() {
        return auEreignis;
    }

    /**
     * Legt den Wert der auEreignis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuEreignis(String value) {
        this.auEreignis = value;
    }

    /**
     * Ruft den Wert der stromUnfall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStromUnfall() {
        return stromUnfall;
    }

    /**
     * Legt den Wert der stromUnfall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStromUnfall(Boolean value) {
        this.stromUnfall = value;
    }

    /**
     * Ruft den Wert der infoAnm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAnm() {
        return infoAnm;
    }

    /**
     * Legt den Wert der infoAnm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAnm(String value) {
        this.infoAnm = value;
    }

    /**
     * Ruft den Wert der ausgangZeit1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ausgangszeit }
     *     
     */
    public Ausgangszeit getAusgangZeit1() {
        return ausgangZeit1;
    }

    /**
     * Legt den Wert der ausgangZeit1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ausgangszeit }
     *     
     */
    public void setAusgangZeit1(Ausgangszeit value) {
        this.ausgangZeit1 = value;
    }

    /**
     * Ruft den Wert der ausgangZeit2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ausgangszeit }
     *     
     */
    public Ausgangszeit getAusgangZeit2() {
        return ausgangZeit2;
    }

    /**
     * Legt den Wert der ausgangZeit2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ausgangszeit }
     *     
     */
    public void setAusgangZeit2(Ausgangszeit value) {
        this.ausgangZeit2 = value;
    }

    /**
     * Ruft den Wert der bettruhe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBettruhe() {
        return bettruhe;
    }

    /**
     * Legt den Wert der bettruhe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBettruhe(Boolean value) {
        this.bettruhe = value;
    }

    /**
     * Ruft den Wert der gehunfaehigBisDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGehunfaehigBisDat() {
        return gehunfaehigBisDat;
    }

    /**
     * Legt den Wert der gehunfaehigBisDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGehunfaehigBisDat(XMLGregorianCalendar value) {
        this.gehunfaehigBisDat = value;
    }

    /**
     * Ruft den Wert der gipsBisDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGipsBisDat() {
        return gipsBisDat;
    }

    /**
     * Legt den Wert der gipsBisDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGipsBisDat(XMLGregorianCalendar value) {
        this.gipsBisDat = value;
    }

    /**
     * Ruft den Wert der wiederbestellDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWiederbestellDat() {
        return wiederbestellDat;
    }

    /**
     * Legt den Wert der wiederbestellDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWiederbestellDat(XMLGregorianCalendar value) {
        this.wiederbestellDat = value;
    }

    /**
     * Ruft den Wert der voraussauendeDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoraussauendeDat() {
        return voraussauendeDat;
    }

    /**
     * Legt den Wert der voraussauendeDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoraussauendeDat(XMLGregorianCalendar value) {
        this.voraussauendeDat = value;
    }

    /**
     * Ruft den Wert der auAdresse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Adresse }
     *     
     */
    public Adresse getAuAdresse() {
        return auAdresse;
    }

    /**
     * Legt den Wert der auAdresse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresse }
     *     
     */
    public void setAuAdresse(Adresse value) {
        this.auAdresse = value;
    }

    /**
     * Ruft den Wert der rueckDatGrund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRueckDatGrund() {
        return rueckDatGrund;
    }

    /**
     * Legt den Wert der rueckDatGrund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRueckDatGrund(String value) {
        this.rueckDatGrund = value;
    }

    /**
     * Ruft den Wert der berufsUnfaehig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBerufsUnfaehig() {
        return berufsUnfaehig;
    }

    /**
     * Legt den Wert der berufsUnfaehig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBerufsUnfaehig(Boolean value) {
        this.berufsUnfaehig = value;
    }

    /**
     * Ruft den Wert der behBeginnDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBehBeginnDat() {
        return behBeginnDat;
    }

    /**
     * Legt den Wert der behBeginnDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBehBeginnDat(XMLGregorianCalendar value) {
        this.behBeginnDat = value;
    }

}
