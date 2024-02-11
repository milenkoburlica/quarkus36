
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Von den Vorgaben des KVT abweichende Ausgangszeit.
 * 
 * <p>Java-Klasse für Ausgangszeit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Ausgangszeit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ausgangVonZeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="ausgangBisZeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ausgangszeit", propOrder = {
    "ausgangVonZeit",
    "ausgangBisZeit"
})
public class Ausgangszeit {

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar ausgangVonZeit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar ausgangBisZeit;

    /**
     * Ruft den Wert der ausgangVonZeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAusgangVonZeit() {
        return ausgangVonZeit;
    }

    /**
     * Legt den Wert der ausgangVonZeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAusgangVonZeit(XMLGregorianCalendar value) {
        this.ausgangVonZeit = value;
    }

    /**
     * Ruft den Wert der ausgangBisZeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAusgangBisZeit() {
        return ausgangBisZeit;
    }

    /**
     * Legt den Wert der ausgangBisZeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAusgangBisZeit(XMLGregorianCalendar value) {
        this.ausgangBisZeit = value;
    }

}
