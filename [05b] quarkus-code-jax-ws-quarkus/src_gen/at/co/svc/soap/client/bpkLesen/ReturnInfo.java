
package at.co.svc.soap.client.bpkLesen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für returnInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="returnInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meldungen" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}meldung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="istOk" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnInfo", propOrder = {
    "meldungen",
    "istOk",
    "returnCode"
})
public class ReturnInfo {

    protected List<Meldung> meldungen;
    @XmlElement(required = true)
    protected String istOk;
    @XmlElement(required = true)
    protected String returnCode;

    /**
     * Gets the value of the meldungen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the meldungen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeldungen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meldung }
     * 
     * 
     */
    public List<Meldung> getMeldungen() {
        if (meldungen == null) {
            meldungen = new ArrayList<Meldung>();
        }
        return this.meldungen;
    }

    /**
     * Ruft den Wert der istOk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstOk() {
        return istOk;
    }

    /**
     * Legt den Wert der istOk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstOk(String value) {
        this.istOk = value;
    }

    /**
     * Ruft den Wert der returnCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Legt den Wert der returnCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}
