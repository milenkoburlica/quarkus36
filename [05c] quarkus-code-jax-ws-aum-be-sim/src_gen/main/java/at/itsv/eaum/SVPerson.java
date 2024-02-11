
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eine Person, die durch ihre SV-Nummer identifiziert wird.
 * 
 * <p>Java-Klasse für SVPerson complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SVPerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.itsv.at/eAUM/}AllgemeinePerson">
 *       &lt;sequence>
 *         &lt;element name="vsnr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vsArt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ohneAnspruch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SVPerson", propOrder = {
    "vsnr",
    "vsArt",
    "ohneAnspruch"
})
public class SVPerson
    extends AllgemeinePerson
{

    @XmlElement(required = true)
    protected String vsnr;
    @XmlElement(required = true)
    protected String vsArt;
    protected boolean ohneAnspruch;

    /**
     * Ruft den Wert der vsnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsnr() {
        return vsnr;
    }

    /**
     * Legt den Wert der vsnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsnr(String value) {
        this.vsnr = value;
    }

    /**
     * Ruft den Wert der vsArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsArt() {
        return vsArt;
    }

    /**
     * Legt den Wert der vsArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsArt(String value) {
        this.vsArt = value;
    }

    /**
     * Ruft den Wert der ohneAnspruch-Eigenschaft ab.
     * 
     */
    public boolean isOhneAnspruch() {
        return ohneAnspruch;
    }

    /**
     * Legt den Wert der ohneAnspruch-Eigenschaft fest.
     * 
     */
    public void setOhneAnspruch(boolean value) {
        this.ohneAnspruch = value;
    }

}
