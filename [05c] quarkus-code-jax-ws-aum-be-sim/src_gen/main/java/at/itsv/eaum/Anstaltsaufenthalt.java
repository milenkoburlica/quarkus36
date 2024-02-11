
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für Anstaltsaufenthalt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Anstaltsaufenthalt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anstaltVonDat" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="anstaltBisDat" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anstaltsaufenthalt", propOrder = {
    "anstaltVonDat",
    "anstaltBisDat"
})
public class Anstaltsaufenthalt {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anstaltVonDat;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anstaltBisDat;

    /**
     * Ruft den Wert der anstaltVonDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnstaltVonDat() {
        return anstaltVonDat;
    }

    /**
     * Legt den Wert der anstaltVonDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnstaltVonDat(XMLGregorianCalendar value) {
        this.anstaltVonDat = value;
    }

    /**
     * Ruft den Wert der anstaltBisDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnstaltBisDat() {
        return anstaltBisDat;
    }

    /**
     * Legt den Wert der anstaltBisDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnstaltBisDat(XMLGregorianCalendar value) {
        this.anstaltBisDat = value;
    }

}
