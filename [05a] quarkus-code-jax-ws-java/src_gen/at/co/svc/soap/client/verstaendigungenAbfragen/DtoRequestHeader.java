
package at.co.svc.soap.client.verstaendigungenAbfragen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoRequestHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoRequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoQuellsystem" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoQuellsystem"/&gt;
 *         &lt;element name="dtoKontextRQ" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoKontextRQ"/&gt;
 *         &lt;element name="dtoZielsystem" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoZielsystem"/&gt;
 *         &lt;element name="nachrichtId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zeichenmenge" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoRequestHeader", propOrder = {
    "dtoQuellsystem",
    "dtoKontextRQ",
    "dtoZielsystem",
    "nachrichtId",
    "zeichenmenge"
})
public class DtoRequestHeader {

    @XmlElement(required = true)
    protected DtoQuellsystem dtoQuellsystem;
    @XmlElement(required = true)
    protected DtoKontextRQ dtoKontextRQ;
    @XmlElement(required = true)
    protected DtoZielsystem dtoZielsystem;
    @XmlElement(required = true)
    protected String nachrichtId;
    @XmlElement(required = true)
    protected String zeichenmenge;

    /**
     * Ruft den Wert der dtoQuellsystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoQuellsystem }
     *     
     */
    public DtoQuellsystem getDtoQuellsystem() {
        return dtoQuellsystem;
    }

    /**
     * Legt den Wert der dtoQuellsystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoQuellsystem }
     *     
     */
    public void setDtoQuellsystem(DtoQuellsystem value) {
        this.dtoQuellsystem = value;
    }

    /**
     * Ruft den Wert der dtoKontextRQ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoKontextRQ }
     *     
     */
    public DtoKontextRQ getDtoKontextRQ() {
        return dtoKontextRQ;
    }

    /**
     * Legt den Wert der dtoKontextRQ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoKontextRQ }
     *     
     */
    public void setDtoKontextRQ(DtoKontextRQ value) {
        this.dtoKontextRQ = value;
    }

    /**
     * Ruft den Wert der dtoZielsystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoZielsystem }
     *     
     */
    public DtoZielsystem getDtoZielsystem() {
        return dtoZielsystem;
    }

    /**
     * Legt den Wert der dtoZielsystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoZielsystem }
     *     
     */
    public void setDtoZielsystem(DtoZielsystem value) {
        this.dtoZielsystem = value;
    }

    /**
     * Ruft den Wert der nachrichtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachrichtId() {
        return nachrichtId;
    }

    /**
     * Legt den Wert der nachrichtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachrichtId(String value) {
        this.nachrichtId = value;
    }

    /**
     * Ruft den Wert der zeichenmenge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeichenmenge() {
        return zeichenmenge;
    }

    /**
     * Legt den Wert der zeichenmenge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeichenmenge(String value) {
        this.zeichenmenge = value;
    }

}
