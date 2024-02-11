
package at.co.svc.soap.client.verstaendigungenAbfragen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoVerstaendigungenABO complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoVerstaendigungenABO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoOutput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anzahlDerVerbleibendenVerstaendigungen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dtoVerstaendigungsEmpfaenger" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoVerstaendigungsEmpfaenger" minOccurs="0"/&gt;
 *         &lt;element name="dtoVerstaendigungListe" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoVerstaendigung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoVerstaendigungenABO", propOrder = {
    "anzahlDerVerbleibendenVerstaendigungen",
    "dtoVerstaendigungsEmpfaenger",
    "dtoVerstaendigungListe"
})
public class DtoVerstaendigungenABO
    extends DtoOutput
{

    protected BigInteger anzahlDerVerbleibendenVerstaendigungen;
    protected DtoVerstaendigungsEmpfaenger dtoVerstaendigungsEmpfaenger;
    @XmlElement(nillable = true)
    protected List<DtoVerstaendigung> dtoVerstaendigungListe;

    /**
     * Ruft den Wert der anzahlDerVerbleibendenVerstaendigungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlDerVerbleibendenVerstaendigungen() {
        return anzahlDerVerbleibendenVerstaendigungen;
    }

    /**
     * Legt den Wert der anzahlDerVerbleibendenVerstaendigungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlDerVerbleibendenVerstaendigungen(BigInteger value) {
        this.anzahlDerVerbleibendenVerstaendigungen = value;
    }

    /**
     * Ruft den Wert der dtoVerstaendigungsEmpfaenger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoVerstaendigungsEmpfaenger }
     *     
     */
    public DtoVerstaendigungsEmpfaenger getDtoVerstaendigungsEmpfaenger() {
        return dtoVerstaendigungsEmpfaenger;
    }

    /**
     * Legt den Wert der dtoVerstaendigungsEmpfaenger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoVerstaendigungsEmpfaenger }
     *     
     */
    public void setDtoVerstaendigungsEmpfaenger(DtoVerstaendigungsEmpfaenger value) {
        this.dtoVerstaendigungsEmpfaenger = value;
    }

    /**
     * Gets the value of the dtoVerstaendigungListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtoVerstaendigungListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtoVerstaendigungListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtoVerstaendigung }
     * 
     * 
     */
    public List<DtoVerstaendigung> getDtoVerstaendigungListe() {
        if (dtoVerstaendigungListe == null) {
            dtoVerstaendigungListe = new ArrayList<DtoVerstaendigung>();
        }
        return this.dtoVerstaendigungListe;
    }

}
