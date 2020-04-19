package u8_T1_Recorrido_XML_SAX_y_DOM;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class RecorridoSAX {

    public static void main(String[] args) {
        /*Hay que recorrer este fichero usando SAX y mostrarlo por pantalla*/

        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler libroSax = new LibroSax();

            saxParser.parse(new File("libros.xml"),libroSax);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

    }

}
