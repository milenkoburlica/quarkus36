
package at.co.svc.soap.client.bpkLesen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoBearbeiterinformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoBearbeiterinformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="erstellerMstCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstellTS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="erstellBerechtigungsSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letztAendMstCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="letztAend" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="letztAendTS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="letztAendBerechtigungsSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bearbeitungsgrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zpvTransaktionsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="funktionKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aktion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoBearbeiterinformation", propOrder = {
    "erstellerMstCode",
    "ersteller",
    "erstellTS",
    "erstellBerechtigungsSystemId",
    "letztAendMstCode",
    "letztAend",
    "letztAendTS",
    "letztAendBerechtigungsSystemId",
    "bearbeitungsgrund",
    "zpvTransaktionsID",
    "funktionKurz",
    "aktion"
})
public class DtoBearbeiterinformation {

    @XmlElement(required = true)
    protected String erstellerMstCode;
    @XmlElement(required = true)
    protected String ersteller;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erstellTS;
    protected String erstellBerechtigungsSystemId;
    @XmlElement(required = true)
    protected String letztAendMstCode;
    @XmlElement(required = true)
    protected String letztAend;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar letztAendTS;
    protected String letztAendBerechtigungsSystemId;
    protected String bearbeitungsgrund;
    protected String zpvTransaktionsID;
    protected String funktionKurz;
    protected String aktion;

    /**
     * Ruft den Wert der erstellerMstCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstellerMstCode() {
        return erstellerMstCode;
    }

    /**
     * Legt den Wert der erstellerMstCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellerMstCode(String value) {
        this.erstellerMstCode = value;
    }

    /**
     * Ruft den Wert der ersteller-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Legt den Wert der ersteller-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErsteller(String value) {
        this.ersteller = value;
    }

    /**
     * Ruft den Wert der erstellTS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstellTS() {
        return erstellTS;
    }

    /**
     * Legt den Wert der erstellTS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstellTS(XMLGregorianCalendar value) {
        this.erstellTS = value;
    }

    /**
     * Ruft den Wert der erstellBerechtigungsSystemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstellBerechtigungsSystemId() {
        return erstellBerechtigungsSystemId;
    }

    /**
     * Legt den Wert der erstellBerechtigungsSystemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellBerechtigungsSystemId(String value) {
        this.erstellBerechtigungsSystemId = value;
    }

    /**
     * Ruft den Wert der letztAendMstCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetztAendMstCode() {
        return letztAendMstCode;
    }

    /**
     * Legt den Wert der letztAendMstCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetztAendMstCode(String value) {
        this.letztAendMstCode = value;
    }

    /**
     * Ruft den Wert der letztAend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetztAend() {
        return letztAend;
    }

    /**
     * Legt den Wert der letztAend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetztAend(String value) {
        this.letztAend = value;
    }

    /**
     * Ruft den Wert der letztAendTS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLetztAendTS() {
        return letztAendTS;
    }

    /**
     * Legt den Wert der letztAendTS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLetztAendTS(XMLGregorianCalendar value) {
        this.letztAendTS = value;
    }

    /**
     * Ruft den Wert der letztAendBerechtigungsSystemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetztAendBerechtigungsSystemId() {
        return letztAendBerechtigungsSystemId;
    }

    /**
     * Legt den Wert der letztAendBerechtigungsSystemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetztAendBerechtigungsSystemId(String value) {
        this.letztAendBerechtigungsSystemId = value;
    }

    /**
     * Ruft den Wert der bearbeitungsgrund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearbeitungsgrund() {
        return bearbeitungsgrund;
    }

    /**
     * Legt den Wert der bearbeitungsgrund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearbeitungsgrund(String value) {
        this.bearbeitungsgrund = value;
    }

    /**
     * Ruft den Wert der zpvTransaktionsID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpvTransaktionsID() {
        return zpvTransaktionsID;
    }

    /**
     * Legt den Wert der zpvTransaktionsID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpvTransaktionsID(String value) {
        this.zpvTransaktionsID = value;
    }

    /**
     * Ruft den Wert der funktionKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunktionKurz() {
        return funktionKurz;
    }

    /**
     * Legt den Wert der funktionKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunktionKurz(String value) {
        this.funktionKurz = value;
    }

    /**
     * Ruft den Wert der aktion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktion() {
        return aktion;
    }

    /**
     * Legt den Wert der aktion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktion(String value) {
        this.aktion = value;
    }

}
