
package at.co.svc.soap.client.bpkLesen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für bkFachschluesselAngabeVO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="bkFachschluesselAngabeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fachschluesselartKurz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fachschluessel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fachschluesselGueltigDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="stornierterFsJN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bkFachschluesselAngabeVO", propOrder = {
    "fachschluesselartKurz",
    "fachschluessel",
    "fachschluesselGueltigDat",
    "stornierterFsJN"
})
public class BkFachschluesselAngabeVO {

    @XmlElement(required = true)
    protected String fachschluesselartKurz;
    @XmlElement(required = true)
    protected String fachschluessel;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fachschluesselGueltigDat;
    protected String stornierterFsJN;

    /**
     * Ruft den Wert der fachschluesselartKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFachschluesselartKurz() {
        return fachschluesselartKurz;
    }

    /**
     * Legt den Wert der fachschluesselartKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFachschluesselartKurz(String value) {
        this.fachschluesselartKurz = value;
    }

    /**
     * Ruft den Wert der fachschluessel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFachschluessel() {
        return fachschluessel;
    }

    /**
     * Legt den Wert der fachschluessel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFachschluessel(String value) {
        this.fachschluessel = value;
    }

    /**
     * Ruft den Wert der fachschluesselGueltigDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFachschluesselGueltigDat() {
        return fachschluesselGueltigDat;
    }

    /**
     * Legt den Wert der fachschluesselGueltigDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFachschluesselGueltigDat(XMLGregorianCalendar value) {
        this.fachschluesselGueltigDat = value;
    }

    /**
     * Ruft den Wert der stornierterFsJN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStornierterFsJN() {
        return stornierterFsJN;
    }

    /**
     * Legt den Wert der stornierterFsJN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStornierterFsJN(String value) {
        this.stornierterFsJN = value;
    }

}
