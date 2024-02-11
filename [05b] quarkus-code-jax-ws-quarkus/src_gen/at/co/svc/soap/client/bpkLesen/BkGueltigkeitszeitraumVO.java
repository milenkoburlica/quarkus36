
package at.co.svc.soap.client.bpkLesen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für bkGueltigkeitszeitraumVO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="bkGueltigkeitszeitraumVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gueltigVonDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="gueltigBisDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bkGueltigkeitszeitraumVO", propOrder = {
    "gueltigVonDAT",
    "gueltigBisDAT"
})
public class BkGueltigkeitszeitraumVO {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigVonDAT;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigBisDAT;

    /**
     * Ruft den Wert der gueltigVonDAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigVonDAT() {
        return gueltigVonDAT;
    }

    /**
     * Legt den Wert der gueltigVonDAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigVonDAT(XMLGregorianCalendar value) {
        this.gueltigVonDAT = value;
    }

    /**
     * Ruft den Wert der gueltigBisDAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigBisDAT() {
        return gueltigBisDAT;
    }

    /**
     * Legt den Wert der gueltigBisDAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigBisDAT(XMLGregorianCalendar value) {
        this.gueltigBisDAT = value;
    }

}
