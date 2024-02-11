
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoQuellsystem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoQuellsystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quellSystemApplikationsId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quellSystemSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quellSystemPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoQuellsystem", propOrder = {
    "quellSystemApplikationsId",
    "quellSystemSystemId",
    "quellSystemPort"
})
public class DtoQuellsystem {

    @XmlElement(required = true)
    protected String quellSystemApplikationsId;
    @XmlElement(required = true)
    protected String quellSystemSystemId;
    protected String quellSystemPort;

    /**
     * Ruft den Wert der quellSystemApplikationsId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuellSystemApplikationsId() {
        return quellSystemApplikationsId;
    }

    /**
     * Legt den Wert der quellSystemApplikationsId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuellSystemApplikationsId(String value) {
        this.quellSystemApplikationsId = value;
    }

    /**
     * Ruft den Wert der quellSystemSystemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuellSystemSystemId() {
        return quellSystemSystemId;
    }

    /**
     * Legt den Wert der quellSystemSystemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuellSystemSystemId(String value) {
        this.quellSystemSystemId = value;
    }

    /**
     * Ruft den Wert der quellSystemPort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuellSystemPort() {
        return quellSystemPort;
    }

    /**
     * Legt den Wert der quellSystemPort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuellSystemPort(String value) {
        this.quellSystemPort = value;
    }

}
