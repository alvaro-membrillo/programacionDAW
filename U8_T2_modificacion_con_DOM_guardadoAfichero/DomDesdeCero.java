package u8_T2_modificacion_con_DOM_guardadoAfichero;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import u8_T3_Uso_de_Stax.Libro;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;

public class DomDesdeCero {

    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(new Libro(14, "Los Miserables", "Victor Hugo", 25));
        libros.add(new Libro(15, "Don Quijote de la Mancha", "Miguel de Cervantes", 30));
        libros.add(new Libro(16, "El Origen de las especies", "Charles Darwin", 14));
        libros.add(new Libro(17, "El Nombre de la Rosa", "Umberto Eco", 13));
        libros.add(new Libro(18, "Lo que el Viento se Llevó", "Margaret Mitchell", 25));
        libros.add(new Libro(19, "Yo, robot", "Isaac Asimov", 22));
        libros.add(new Libro(20, "It", "Stephen King", 25));
        libros.add(new Libro(21, "Ek resplandor", "Stephen King", 27));
        libros.add(new Libro(22, "El Instituto", "Stephen King", 20));
        libros.add(new Libro(23, "Carrie", "Stephen King", 23));
        libros.add(new Libro(24, "Cementerio de Animales", "Stephen King", 15));

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element root = doc.createElement("ordenadores");
            doc.appendChild(root);

            for (Libro l : libros) {
                Element libro = doc.createElement("libro");
                libro.setAttribute("isbn", Integer.toString(l.getIsbn()));

                Element titulo = doc.createElement("titulo");
                titulo.setTextContent(l.getTitulo());

                Element escritor = doc.createElement("escritor");
                escritor.setTextContent(l.getEscritor());

                Element precio = doc.createElement("precio");
                precio.setTextContent(Integer.toString(l.getPrecio()));

                libro.appendChild(titulo);
                libro.appendChild(escritor);
                libro.appendChild(precio);
                root.appendChild(libro);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/sxlt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);
            File newLibros = new File("cero.xml");
            StreamResult destino = new StreamResult(newLibros);
            transformer.transform(origenDOM, destino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
