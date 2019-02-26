package parser.SAX;


import model.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXHandler extends DefaultHandler {
    private List<Gun> gunList = new ArrayList<>();
    private Gun gun = null;
    private String carry = null;
    private Integer hands = null;
    private String material = null;
    private String  opticsAvailability = null;
    private String origin =null;
    private Integer sightRange = null;
    private String stockAvailability = null;
    private TTC ttc = new TTC();





    private boolean gModel = false;
    private boolean gHandy = false;
    private boolean gOrigin = false;
    private boolean gMaterial= false;
    private boolean gTTC = false;
    private boolean gSightRange = false;
    private boolean gStockAvailability = false;
    private boolean gOpticsAvailability = false;
    private boolean gCarry = false;



    public List<Gun> getGunList(){
        return this.gunList;
    }

    public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("gun")){
            gun = new Gun();
        }
        else if (qName.equalsIgnoreCase("model")){gModel = true;}
        else if (qName.equalsIgnoreCase("origin")){gOrigin = true;}
        else if (qName.equalsIgnoreCase("handy")){gHandy = true;}
        else if (qName.equalsIgnoreCase("material")){gMaterial = true;}
        else if (qName.equalsIgnoreCase("TTC")){gTTC = true;}
        else if (qName.equalsIgnoreCase("sight_range")){gSightRange = true;}
        else if (qName.equalsIgnoreCase("stock_availability")){gStockAvailability = true;}
        else if (qName.equalsIgnoreCase("optics_availability")){gOpticsAvailability = true;}
        else if (qName.equalsIgnoreCase("carry")){gCarry = true;}

    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("gun")){
            gunList.add(gun);
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        if (gModel){
            gun.setModel(new String(ch, start, length));
            gModel = false;
        }
        else if (gOrigin){
            gun.setOrigin(new String(ch, start, length));
            gOrigin = false;
        }
        else if (gHandy){
            gun.setHandy(Integer.parseInt(new String(ch, start, length)));

            gHandy = false;
        }
        else if (gMaterial){
            gun.setMaterial(new String(ch, start, length));
            gMaterial = false;
        }
//        else if(gTTC){
////
////            ttc =new TTC();
////            gTTC = false;
////        }
        else if (gSightRange){
            ttc.setSightRange(Integer.parseInt(new String(ch, start, length)));
            gSightRange = false;
        }
        else if (gStockAvailability){
            ttc.setStockAvailability(new String(ch, start, length));
            gStockAvailability = false;
        }
        else if (gOpticsAvailability){
            ttc.setOpticsAvailability(new String(ch, start, length));
            gOpticsAvailability = false;
        }
        else if (gCarry){
            ttc.setCarry(new String(ch, start, length));
            gun.setTtc(ttc);
            gCarry = false;
        }

    }
}
