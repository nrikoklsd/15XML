package parser.SAX;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;


public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser xmlReader = saxParserFactory.newSAXParser();

        DefaultHandler handler = new DefaultHandler(){
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                super.startElement(uri, localName, qName, attributes);
            }
            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                super.characters(ch, start, length);
            }
        };

        xmlReader.parse(new File("/Users/admin/Desktop/zxc/_15xml/src/main/resources/guns.xml"),handler);



        //task5
        InputStream xml = new FileInputStream(new File("/Users/admin/Desktop/zxc/_15xml/src/main/resources/guns.xml"));
        InputStream xsd = new FileInputStream(new File("/Users/admin/Desktop/zxc/_15xml/src/main/resources/guns.xsd"));
        System.out.println(SAXValidator.validateAgainstXSD(xml,xsd));
        //--------------------------------


        File xml2 = new File("/Users/admin/Desktop/zxc/_15xml/src/main/resources/guns.xml");
        File xsd2 = new File("/Users/admin/Desktop/zxc/_15xml/src/main/resources/guns.xsd");

        System.out.println();
        System.out.println(SAXParserUser.parseGuns(xml2, xsd2));



    }
}
