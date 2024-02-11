
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Enthält die Daten, die für alle Patienten anzugeben sind;
 *     gleichzeitig sind dies die Daten für Patienten, die
 *     weder eine SV-Nummer noch eine EKVK haben.
 *    
 * 
 * <p>Java-Klasse für AllgemeinePerson complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AllgemeinePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nachName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vorName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="geburtsDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllgemeinePerson", propOrder = {
    "nachName",
    "vorName",
    "geburtsDat"
})
@XmlSeeAlso({
    EKVKPerson.class,
    SVPerson.class
})
public class AllgemeinePerson {

    protected String nachName;
    protected String vorName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar geburtsDat;

    /**
     * Ruft den Wert der nachName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * Legt den Wert der nachName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachName(String value) {
        this.nachName = value;
    }

    /**
     * Ruft den Wert der vorName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * Legt den Wert der vorName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorName(String value) {
        this.vorName = value;
    }

    /**
     * Ruft den Wert der geburtsDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeburtsDat() {
        return geburtsDat;
    }

    /**
     * Legt den Wert der geburtsDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeburtsDat(XMLGregorianCalendar value) {
        this.geburtsDat = value;
    }

}
