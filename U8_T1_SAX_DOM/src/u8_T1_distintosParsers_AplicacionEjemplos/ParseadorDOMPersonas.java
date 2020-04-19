package u8_T1_distintosParsers_AplicacionEjemplos;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ParseadorDOMPersonas {

    public static void main(String[] args) {
        parse("personas.xml");
    }

    public static void parse(String nomFile) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(nomFile);
            NodeList listaPersonas = doc.getElementsByTagName("personas");
            
            for (int i = 0; i < listaPersonas.getLength(); i++) {
                Node nodo = listaPersonas.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodo;
                    NodeList hijos = element.getChildNodes();

                    for (int j = 0; j < hijos.getLength(); j++) {
                        Node hijo = hijos.item(j);
                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                            //Element eHijo = (Element) hijo;
                            System.out.println("Propiedad: " + hijo.getNodeName() + ", Valor: " + hijo.getTextContent());
                        }
                    }
                    System.out.println("");
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
