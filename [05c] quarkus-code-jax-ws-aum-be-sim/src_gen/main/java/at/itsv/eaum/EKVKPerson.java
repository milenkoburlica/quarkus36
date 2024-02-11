
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eine Person, die über ihre EKVK-Nummer identifiziert wird.
 * 
 * <p>Java-Klasse für EKVKPerson complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EKVKPerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.itsv.at/eAUM/}AllgemeinePerson">
 *       &lt;sequence>
 *         &lt;element name="ekvk">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ausltr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EKVKPerson", propOrder = {
    "ekvk",
    "ausltr"
})
public class EKVKPerson
    extends AllgemeinePerson
{

    @XmlElement(required = true)
    protected String ekvk;
    protected String ausltr;

    /**
     * Ruft den Wert der ekvk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkvk() {
        return ekvk;
    }

    /**
     * Legt den Wert der ekvk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkvk(String value) {
        this.ekvk = value;
    }

    /**
     * Ruft den Wert der ausltr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAusltr() {
        return ausltr;
    }

    /**
     * Legt den Wert der ausltr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAusltr(String value) {
        this.ausltr = value;
    }

}
