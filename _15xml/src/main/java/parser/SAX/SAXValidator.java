package parser.SAX;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.InputStream;
//for task5
public class SAXValidator {
    static boolean validateAgainstXSD(InputStream xml, InputStream xsd)
    {
        try
        {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
        public static Schema createSchema(File xsd){
        Schema schema = null;
        try {
            String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
            SchemaFactory factory = SchemaFactory.newInstance(language);
            schema = factory.newSchema(xsd);

        }catch (SAXException ex){
            ex.printStackTrace();
        }

        return schema;
    }
}
//public class SAXValidator {
//    public static Schema createSchema(File xsd){
//        Schema schema = null;
//        try {
//            String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
//            SchemaFactory factory = SchemaFactory.newInstance(language);
//            schema = factory.newSchema(xsd);
//
//        }catch (SAXException ex){
//            ex.printStackTrace();
//        }
//
//        return schema;
//    }
//}