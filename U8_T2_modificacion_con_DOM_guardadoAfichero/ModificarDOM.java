package u8_T2_modificacion_con_DOM_guardadoAfichero;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        try {
            /*Cargamos el contenido SML en la estructura DOM*/
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("libros.xml"));

            Node root = doc.getDocumentElement();
            NodeList nl = doc.getElementsByTagName("libro");

            for (int i = 0; i < nl.getLength(); i++) {
                root.getParentNode();
                Element libro = (Element) doc.getElementsByTagName("libro").item(i);
                comentario = doc.createComment("Comentario añadido desde DOM");
                //root.insertBefore(comentario.cloneNode(false), libro);
                root.insertBefore(comentario, libro);
            }

            Element libro = doc.createElement("libro");
            libro.setAttribute("isbn","1");

            Element titulo = doc.createElement("titulo");
            titulo.setTextContent("100 años de soledad");

            Element escritor = doc.createElement("escritor");
            escritor.setTextContent("Gabriel Garcia");

            Element precio = doc.createElement("precio");
            precio.setTextContent("20");


            libro.appendChild(titulo);
            libro.appendChild(escritor);
            libro.appendChild(precio);


            Element libro2 = doc.createElement("libro");
            libro2.setAttribute("isbn","123");

            Element titulo2 = doc.createElement("titulo");
            titulo2.setTextContent("niebla");

            Element escritor2 = doc.createElement("Autor");
            escritor2.setTextContent("Miguel de unamuno");

            Element precio2 = doc.createElement("precio");
            precio2.setTextContent("8");

            libro2.appendChild(titulo2);
            libro2.appendChild(escritor2);
            libro2.appendChild(precio2);


            Element primerLibro = (Element) doc.getElementsByTagName("libro").item(0);
            root.replaceChild(libro2,primerLibro);


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoLibros = new File("nuevoLibros.xml");
            StreamResult destino = new StreamResult(nuevoLibros);

            transformer.transform(origenDOM, destino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
