
package at.co.svc.soap.client.verstaendigungenAbfragen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoVerstaendigungsEmpfaenger complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoVerstaendigungsEmpfaenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meldendeStelleCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="svtNutzsystemKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verstaendPeriodenartKurz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoVerstaendigungsEmpfaenger", propOrder = {
    "meldendeStelleCode",
    "svtNutzsystemKurz",
    "verstaendPeriodenartKurz"
})
public class DtoVerstaendigungsEmpfaenger {

    @XmlElement(required = true)
    protected String meldendeStelleCode;
    protected String svtNutzsystemKurz;
    @XmlElement(required = true)
    protected String verstaendPeriodenartKurz;

    /**
     * Ruft den Wert der meldendeStelleCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldendeStelleCode() {
        return meldendeStelleCode;
    }

    /**
     * Legt den Wert der meldendeStelleCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldendeStelleCode(String value) {
        this.meldendeStelleCode = value;
    }

    /**
     * Ruft den Wert der svtNutzsystemKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvtNutzsystemKurz() {
        return svtNutzsystemKurz;
    }

    /**
     * Legt den Wert der svtNutzsystemKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvtNutzsystemKurz(String value) {
        this.svtNutzsystemKurz = value;
    }

    /**
     * Ruft den Wert der verstaendPeriodenartKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerstaendPeriodenartKurz() {
        return verstaendPeriodenartKurz;
    }

    /**
     * Legt den Wert der verstaendPeriodenartKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerstaendPeriodenartKurz(String value) {
        this.verstaendPeriodenartKurz = value;
    }

}
