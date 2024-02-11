
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für bkUnbestaetigtesGeburtsdatumVO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="bkUnbestaetigtesGeburtsdatumVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unvollstaendigesDatum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bkUnbestaetigtesGeburtsdatumVO", propOrder = {
    "unvollstaendigesDatum"
})
public class BkUnbestaetigtesGeburtsdatumVO {

    @XmlElement(required = true)
    protected String unvollstaendigesDatum;

    /**
     * Ruft den Wert der unvollstaendigesDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnvollstaendigesDatum() {
        return unvollstaendigesDatum;
    }

    /**
     * Legt den Wert der unvollstaendigesDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnvollstaendigesDatum(String value) {
        this.unvollstaendigesDatum = value;
    }

}
