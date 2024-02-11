
package at.co.svc.soap.client.bpkLesen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtObPKListeLEI complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtObPKListeLEI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoInput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtobPKLEIListe" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtObPKLEI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtObPKListeLEI", propOrder = {
    "dtobPKLEIListe"
})
public class DtObPKListeLEI
    extends DtoInput
{

    @XmlElement(nillable = true)
    protected List<DtObPKLEI> dtobPKLEIListe;

    /**
     * Gets the value of the dtobPKLEIListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtobPKLEIListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtobPKLEIListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtObPKLEI }
     * 
     * 
     */
    public List<DtObPKLEI> getDtobPKLEIListe() {
        if (dtobPKLEIListe == null) {
            dtobPKLEIListe = new ArrayList<DtObPKLEI>();
        }
        return this.dtobPKLEIListe;
    }

}
