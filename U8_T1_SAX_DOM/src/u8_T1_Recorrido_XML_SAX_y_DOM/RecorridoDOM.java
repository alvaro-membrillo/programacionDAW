package u8_T1_Recorrido_XML_SAX_y_DOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {

    Document doc;

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.parse(new File("libros.xml"));

        RecorridoDOM objeto = new RecorridoDOM();

        objeto.numNodosHijos();
        objeto.mostrarXMLDom();
        //objeto.mostrarContenidoEtiqueta("libros");

    }

    public RecorridoDOM() throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File("libros.xml"));
    }

    public void numNodosHijos() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File("libros.xml"));

        Element root = doc.getDocumentElement();
        NodeList nl = root.getChildNodes();


        /*Aquí mostramos el numero de nodos hijos que tiene el nodo raiz*/
        System.out.println("Tiene " + root.getChildNodes().getLength() + " nodos hijos (dentro del nodo raiz)");

        for (int i = 0; i < nl.getLength(); i++) {
            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("He encontrado un nodo etiqueta");
                Element e = (Element) nl.item(i);
                System.out.println("Es la etiqueta " + e.getTagName());
                System.out.println("Y contiene: ");
                System.out.println(e.getTextContent());

                /*Compruebo si el elemento etiqueta tiene atributos*/
                if (e.hasAttributes()) {
                    System.out.println("Este nodo tiene atributos");
                    NamedNodeMap nodeMap = e.getAttributes();

                    /*Muestro los atributos*/
                    for (int j = 0; j < nodeMap.getLength(); j++) {
                        Node node = nodeMap.item(j);
                        Attr atributo = e.getAttributeNode(node.getNodeName());
                        System.out.println("Atributo: " + atributo.getNodeName());
                        System.out.println("Valor: " + atributo.getValue());
                    }
                }

                //Nodo texto
            } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                System.out.println("He encontrado un nodo texto");
                System.out.println("Contiene: ");
                Text texto = (Text) nl.item(i);
                System.out.println(texto.getTextContent());

            } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                System.out.println("He encontrado un nodo comentario");
                System.out.println("Contiene: ");
                Comment comentario = (Comment) nl.item(i);
                System.out.println(comentario.getTextContent());
            }
            System.out.println("------------------------------------------");
        }

    }

    public void mostrarXMLDom() {
        /*Muestra el contenido del fichero XML llegando únicamente al primer nivel. A partir de aqui piedo mostrar el contenido completo
         * de todos los nodos*/
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("libros.xml"));

            NodeList nl = doc.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);
                    System.out.println(e.getTextContent());
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

    public void mostrarContenidoEtiqueta(Element e) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse("libros.xml");


            NodeList nl = doc.getElementsByTagName("libro");

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i) != null) {
                    System.out.println(nl.item(i).getTextContent());
                } else {
                    System.out.println("No tiene ocurrencia");
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException c) {
            c.printStackTrace();
        }
    }

}
