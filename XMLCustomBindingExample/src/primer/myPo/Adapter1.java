//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.30 at 01:08:41 PM CST 
//


package primer.myPo;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (primer.MyDatatypeConverter.parseIntegerToInt(value));
    }

    public String marshal(Integer value) {
        return (primer.MyDatatypeConverter.printIntToInteger(value));
    }

}
