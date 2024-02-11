
package at.itsv.eaum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeldungsArt.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeldungsArt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="4"/>
 *     &lt;enumeration value="AU01"/>
 *     &lt;enumeration value="AU02"/>
 *     &lt;enumeration value="AF01"/>
 *     &lt;enumeration value="AF02"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeldungsArt")
@XmlEnum
public enum MeldungsArt {

    @XmlEnumValue("AU01")
    AU_01("AU01"),
    @XmlEnumValue("AU02")
    AU_02("AU02"),
    @XmlEnumValue("AF01")
    AF_01("AF01"),
    @XmlEnumValue("AF02")
    AF_02("AF02");
    private final String value;

    MeldungsArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeldungsArt fromValue(String v) {
        for (MeldungsArt c: MeldungsArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
