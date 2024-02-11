
package at.co.svc.soap.client.bpkLesen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtObPKLEO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtObPKLEO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoPartnerKurz" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoPartnerKurz"/&gt;
 *         &lt;element name="dtobPKListe" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtObPK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zusatzFehlerpaket" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}returnInfo"/&gt;
 *         &lt;element name="dtoPartnerrolleKurz" type="{http://www.sozialversicherung.at/schema/zpv/ibs/BpkLesen_5_0}dtoPartnerrolleKurz" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtObPKLEO", propOrder = {
    "dtoPartnerKurz",
    "dtobPKListe",
    "zusatzFehlerpaket",
    "dtoPartnerrolleKurz"
})
public class DtObPKLEO {

    @XmlElement(required = true)
    protected DtoPartnerKurz dtoPartnerKurz;
    @XmlElement(nillable = true)
    protected List<DtObPK> dtobPKListe;
    @XmlElement(required = true)
    protected ReturnInfo zusatzFehlerpaket;
    protected DtoPartnerrolleKurz dtoPartnerrolleKurz;

    /**
     * Ruft den Wert der dtoPartnerKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoPartnerKurz }
     *     
     */
    public DtoPartnerKurz getDtoPartnerKurz() {
        return dtoPartnerKurz;
    }

    /**
     * Legt den Wert der dtoPartnerKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoPartnerKurz }
     *     
     */
    public void setDtoPartnerKurz(DtoPartnerKurz value) {
        this.dtoPartnerKurz = value;
    }

    /**
     * Gets the value of the dtobPKListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtobPKListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtobPKListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtObPK }
     * 
     * 
     */
    public List<DtObPK> getDtobPKListe() {
        if (dtobPKListe == null) {
            dtobPKListe = new ArrayList<DtObPK>();
        }
        return this.dtobPKListe;
    }

    /**
     * Ruft den Wert der zusatzFehlerpaket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInfo }
     *     
     */
    public ReturnInfo getZusatzFehlerpaket() {
        return zusatzFehlerpaket;
    }

    /**
     * Legt den Wert der zusatzFehlerpaket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInfo }
     *     
     */
    public void setZusatzFehlerpaket(ReturnInfo value) {
        this.zusatzFehlerpaket = value;
    }

    /**
     * Ruft den Wert der dtoPartnerrolleKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoPartnerrolleKurz }
     *     
     */
    public DtoPartnerrolleKurz getDtoPartnerrolleKurz() {
        return dtoPartnerrolleKurz;
    }

    /**
     * Legt den Wert der dtoPartnerrolleKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoPartnerrolleKurz }
     *     
     */
    public void setDtoPartnerrolleKurz(DtoPartnerrolleKurz value) {
        this.dtoPartnerrolleKurz = value;
    }

}
