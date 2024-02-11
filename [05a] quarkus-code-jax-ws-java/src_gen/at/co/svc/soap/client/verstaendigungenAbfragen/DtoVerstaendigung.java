
package at.co.svc.soap.client.verstaendigungenAbfragen;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dtoVerstaendigung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dtoVerstaendigung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoBearbeiterinformation" type="{http://www.sozialversicherung.at/schema/zpv/ibs/VerstaendigungenAbfragen_3_0}dtoBearbeiterinformation"/&gt;
 *         &lt;element name="parParrolleID_Partner" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="parParrolleID_Partnerrolle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="verstaendigungsnr" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="vormerkobjektartKurz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durchfuehrungTs" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="verstaendigungCDATA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtoVerstaendigung", propOrder = {
    "dtoBearbeiterinformation",
    "parParrolleIDPartner",
    "parParrolleIDPartnerrolle",
    "verstaendigungsnr",
    "vormerkobjektartKurz",
    "durchfuehrungTs",
    "verstaendigungCDATA"
})
public class DtoVerstaendigung {

    @XmlElement(required = true)
    protected DtoBearbeiterinformation dtoBearbeiterinformation;
    @XmlElement(name = "parParrolleID_Partner", required = true)
    protected BigInteger parParrolleIDPartner;
    @XmlElement(name = "parParrolleID_Partnerrolle")
    protected BigInteger parParrolleIDPartnerrolle;
    @XmlElement(required = true)
    protected BigInteger verstaendigungsnr;
    @XmlElement(required = true)
    protected String vormerkobjektartKurz;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar durchfuehrungTs;
    @XmlElement(required = true)
    protected String verstaendigungCDATA;

    /**
     * Ruft den Wert der dtoBearbeiterinformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtoBearbeiterinformation }
     *     
     */
    public DtoBearbeiterinformation getDtoBearbeiterinformation() {
        return dtoBearbeiterinformation;
    }

    /**
     * Legt den Wert der dtoBearbeiterinformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoBearbeiterinformation }
     *     
     */
    public void setDtoBearbeiterinformation(DtoBearbeiterinformation value) {
        this.dtoBearbeiterinformation = value;
    }

    /**
     * Ruft den Wert der parParrolleIDPartner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParParrolleIDPartner() {
        return parParrolleIDPartner;
    }

    /**
     * Legt den Wert der parParrolleIDPartner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParParrolleIDPartner(BigInteger value) {
        this.parParrolleIDPartner = value;
    }

    /**
     * Ruft den Wert der parParrolleIDPartnerrolle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParParrolleIDPartnerrolle() {
        return parParrolleIDPartnerrolle;
    }

    /**
     * Legt den Wert der parParrolleIDPartnerrolle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParParrolleIDPartnerrolle(BigInteger value) {
        this.parParrolleIDPartnerrolle = value;
    }

    /**
     * Ruft den Wert der verstaendigungsnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVerstaendigungsnr() {
        return verstaendigungsnr;
    }

    /**
     * Legt den Wert der verstaendigungsnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVerstaendigungsnr(BigInteger value) {
        this.verstaendigungsnr = value;
    }

    /**
     * Ruft den Wert der vormerkobjektartKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVormerkobjektartKurz() {
        return vormerkobjektartKurz;
    }

    /**
     * Legt den Wert der vormerkobjektartKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVormerkobjektartKurz(String value) {
        this.vormerkobjektartKurz = value;
    }

    /**
     * Ruft den Wert der durchfuehrungTs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDurchfuehrungTs() {
        return durchfuehrungTs;
    }

    /**
     * Legt den Wert der durchfuehrungTs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDurchfuehrungTs(XMLGregorianCalendar value) {
        this.durchfuehrungTs = value;
    }

    /**
     * Ruft den Wert der verstaendigungCDATA-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerstaendigungCDATA() {
        return verstaendigungCDATA;
    }

    /**
     * Legt den Wert der verstaendigungCDATA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerstaendigungCDATA(String value) {
        this.verstaendigungCDATA = value;
    }

}
