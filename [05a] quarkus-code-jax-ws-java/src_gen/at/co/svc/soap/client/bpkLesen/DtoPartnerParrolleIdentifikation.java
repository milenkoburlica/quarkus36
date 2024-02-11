
package at.co.svc.soap.client.bpkLesen;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoPartnerParrolleIdentifikation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoPartnerParrolleIdentifikation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parParrolleID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="bkFachschluesselAngabe" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}bkFachschluesselAngabeVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoPartnerParrolleIdentifikation", propOrder = {
    "parParrolleID",
    "bkFachschluesselAngabe"
})
public class DtoPartnerParrolleIdentifikation {

    protected BigInteger parParrolleID;
    protected BkFachschluesselAngabeVO bkFachschluesselAngabe;

    /**
     * Ruft den Wert der parParrolleID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParParrolleID() {
        return parParrolleID;
    }

    /**
     * Legt den Wert der parParrolleID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParParrolleID(BigInteger value) {
        this.parParrolleID = value;
    }

    /**
     * Ruft den Wert der bkFachschluesselAngabe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BkFachschluesselAngabeVO }
     *     
     */
    public BkFachschluesselAngabeVO getBkFachschluesselAngabe() {
        return bkFachschluesselAngabe;
    }

    /**
     * Legt den Wert der bkFachschluesselAngabe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BkFachschluesselAngabeVO }
     *     
     */
    public void setBkFachschluesselAngabe(BkFachschluesselAngabeVO value) {
        this.bkFachschluesselAngabe = value;
    }

}
