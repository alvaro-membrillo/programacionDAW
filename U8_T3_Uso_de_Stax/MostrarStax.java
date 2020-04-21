package u8_T3_Uso_de_Stax;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MostrarStax {

    public static void main(String[] args) {
        /*Recorrer el fichero XML con Stax*/
        /*Mostrar por pantalla el contenido del fichero XML*/
        /*Se valora que la salida esté lo mejor maquetada posible*/
        ArrayList<Libro> libros = new ArrayList<>();
        Libro libroActual = null;
        String tagActual = "";

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("libros.xml"));

            while(xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    //Obtengo la información de la etiqueta
                    StartElement startTag = xmlEvent.asStartElement();

                    /*Inicio de la apertura de la etiqueta pero no la cierro por
                    si tiene atributos*/
                    System.out.print("<" + startTag.getName().getLocalPart());

                    //Dependiendo del nombre de la etiqueta
                    String tagName = startTag.getName().getLocalPart();

                    switch (tagName) {
                        case "libro":
                            libroActual = new Libro();
                            tagActual = "libro";

                            Attribute id = startTag.getAttributeByName(new QName("isbn"));

                            libroActual.setIsbn(Integer.valueOf(id.getValue()));
                            System.out.print(" " + id.getName() + "=\"" + id.getValue() + "\"");
                            //System.out.println();

                        case "titulo":
                            tagActual = "titulo";
                            break;

                        case "escritor":
                            tagActual = "escritor";
                            break;

                        case "precio":
                            tagActual = "precio";
                            break;

                        case "libros":
                            tagActual = "libros";
                            break;
                    }

                    System.out.print(">"); //Cierro la etiqueta de apertura

                    if (tagName.equals("libros")) {
                        System.out.println(); //Añadimos un espacio para mejorar el aspecto del resultado por consola
                    }

                } else if (xmlEvent.isEndElement()) {
                    //Cuando recibimos el evento de fin de etiqueta mostramos la etiqueta de cierre
                    EndElement endTag = xmlEvent.asEndElement();
                    System.out.println("<\\"+endTag.getName().getLocalPart()+">");


                    if (endTag.getName().getLocalPart().equals("libro")) {
                        libros.add(libroActual);
                    }

                    //Ya no estoy dentro de ninguna de las etiquetas
                    tagActual = "";

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo el parseado del documento");
                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento");
                } else if (xmlEvent.isCharacters()) {
                    //Estoy en un nodo de texto
                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }

                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "titulo":
                                libroActual.setTitulo(texto.getData());
                                break;
                            case "escritor":
                                libroActual.setEscritor(texto.getData());
                                break;
                            case "precio":
                                libroActual.setPrecio(Integer.valueOf(texto.getData()));
                                break;
                        }
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

        //Al salir del bloque ya tengo todos los libros, puedo sacarlos por pantalla
        //System.out.println(libros);

    }
}
