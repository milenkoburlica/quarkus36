
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.itsv.at/eAUM/}MeldungsInhalt"/>
 *         &lt;element ref="{http://www.itsv.at/eAUM/}MeldungsInfo"/>
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
    "meldungsInhalt",
    "meldungsInfo"
})
@XmlRootElement(name = "MeldungRequest")
public class MeldungRequest {

    @XmlElement(name = "MeldungsInhalt", required = true)
    protected MeldungsInhalt meldungsInhalt;
    @XmlElement(name = "MeldungsInfo", required = true)
    protected MeldungsInfo meldungsInfo;

    /**
     * Ruft den Wert der meldungsInhalt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeldungsInhalt }
     *     
     */
    public MeldungsInhalt getMeldungsInhalt() {
        return meldungsInhalt;
    }

    /**
     * Legt den Wert der meldungsInhalt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungsInhalt }
     *     
     */
    public void setMeldungsInhalt(MeldungsInhalt value) {
        this.meldungsInhalt = value;
    }

    /**
     * Ruft den Wert der meldungsInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeldungsInfo }
     *     
     */
    public MeldungsInfo getMeldungsInfo() {
        return meldungsInfo;
    }

    /**
     * Legt den Wert der meldungsInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldungsInfo }
     *     
     */
    public void setMeldungsInfo(MeldungsInfo value) {
        this.meldungsInfo = value;
    }

}
