
package at.co.svc.soap.client.bpkLesen;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoKontextRQ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoKontextRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoBearbeiter" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoBearbeiter"/&gt;
 *         &lt;element name="transaktionsID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="verarbeitungsModus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primaerSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vorgaengerNachrichtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ebenenSequenzNummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="bearbeitungsGrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoKontextRQ", propOrder = {
    "dtoBearbeiter",
    "transaktionsID",
    "verarbeitungsModus",
    "primaerSystemId",
    "vorgaengerNachrichtId",
    "ebenenSequenzNummer",
    "bearbeitungsGrund"
})
public class DtoKontextRQ {

    @XmlElement(required = true)
    protected DtoBearbeiter dtoBearbeiter;
    @XmlElement(required = true)
    protected String transaktionsID;
    @XmlElement(required = true)
    protected String verarbeitungsModus;
    @XmlElement(required = true)
    protected String primaerSystemId;
    protected String vorgaengerNachrichtId;
    @XmlElement(required = true)
    protected BigInteger ebenenSequenzNummer;
    protected String bearbeitungsGrund;

    /**
     * Ruft den Wert der dtoBearbeiter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoBearbeiter }
     *     
     */
    public DtoBearbeiter getDtoBearbeiter() {
        return dtoBearbeiter;
    }

    /**
     * Legt den Wert der dtoBearbeiter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoBearbeiter }
     *     
     */
    public void setDtoBearbeiter(DtoBearbeiter value) {
        this.dtoBearbeiter = value;
    }

    /**
     * Ruft den Wert der transaktionsID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaktionsID() {
        return transaktionsID;
    }

    /**
     * Legt den Wert der transaktionsID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaktionsID(String value) {
        this.transaktionsID = value;
    }

    /**
     * Ruft den Wert der verarbeitungsModus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerarbeitungsModus() {
        return verarbeitungsModus;
    }

    /**
     * Legt den Wert der verarbeitungsModus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerarbeitungsModus(String value) {
        this.verarbeitungsModus = value;
    }

    /**
     * Ruft den Wert der primaerSystemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaerSystemId() {
        return primaerSystemId;
    }

    /**
     * Legt den Wert der primaerSystemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaerSystemId(String value) {
        this.primaerSystemId = value;
    }

    /**
     * Ruft den Wert der vorgaengerNachrichtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorgaengerNachrichtId() {
        return vorgaengerNachrichtId;
    }

    /**
     * Legt den Wert der vorgaengerNachrichtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorgaengerNachrichtId(String value) {
        this.vorgaengerNachrichtId = value;
    }

    /**
     * Ruft den Wert der ebenenSequenzNummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEbenenSequenzNummer() {
        return ebenenSequenzNummer;
    }

    /**
     * Legt den Wert der ebenenSequenzNummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEbenenSequenzNummer(BigInteger value) {
        this.ebenenSequenzNummer = value;
    }

    /**
     * Ruft den Wert der bearbeitungsGrund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearbeitungsGrund() {
        return bearbeitungsGrund;
    }

    /**
     * Legt den Wert der bearbeitungsGrund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearbeitungsGrund(String value) {
        this.bearbeitungsGrund = value;
    }

}
