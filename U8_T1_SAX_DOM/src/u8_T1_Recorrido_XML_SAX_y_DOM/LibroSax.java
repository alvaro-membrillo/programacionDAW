package u8_T1_Recorrido_XML_SAX_y_DOM;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LibroSax extends DefaultHandler {

    public LibroSax() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Empieza el parseado del documento libros.xml");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Termina el parseado del documento libros.xml");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        /*Apertura de etiqueta*/
        System.out.print("<"+qName);

        //bucle para recorrer sus atributos si los tiene
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }
        //cierre de la etiqueta
        System.out.print(">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        System.out.print("</"+qName+">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch, start, length);
        System.out.print(content);
    }
}
