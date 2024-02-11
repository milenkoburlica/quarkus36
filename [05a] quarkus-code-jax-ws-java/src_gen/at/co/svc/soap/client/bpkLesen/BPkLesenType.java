
package at.co.svc.soap.client.bpkLesen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für bPkLesenType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="bPkLesenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtobPKListeLEI" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtObPKListeLEI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bPkLesenType", propOrder = {
    "dtobPKListeLEI"
})
public class BPkLesenType {

    protected DtObPKListeLEI dtobPKListeLEI;

    /**
     * Ruft den Wert der dtobPKListeLEI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtObPKListeLEI }
     *     
     */
    public DtObPKListeLEI getDtobPKListeLEI() {
        return dtobPKListeLEI;
    }

    /**
     * Legt den Wert der dtobPKListeLEI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtObPKListeLEI }
     *     
     */
    public void setDtobPKListeLEI(DtObPKListeLEI value) {
        this.dtobPKListeLEI = value;
    }

}
