
package at.co.svc.soap.client.bpkLesen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtObPKListeLEO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtObPKListeLEO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoOutput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtobPKLEOListe" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtObPKLEO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtObPKListeLEO", propOrder = {
    "dtobPKLEOListe"
})
public class DtObPKListeLEO
    extends DtoOutput
{

    @XmlElement(nillable = true)
    protected List<DtObPKLEO> dtobPKLEOListe;

    /**
     * Gets the value of the dtobPKLEOListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtobPKLEOListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtobPKLEOListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtObPKLEO }
     * 
     * 
     */
    public List<DtObPKLEO> getDtobPKLEOListe() {
        if (dtobPKLEOListe == null) {
            dtobPKLEOListe = new ArrayList<DtObPKLEO>();
        }
        return this.dtobPKLEOListe;
    }

}
