package u8_T3_Uso_de_Stax;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class CrearStaxCero {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona(1,35,"Miguel","España"));
        personas.add(new Persona(2,15,"Raquel","Andorra"));
        personas.add(new Persona(3,10,"Ramon","Portugal"));
        personas.add(new Persona(4,50,"Julia","Venezuela"));
        personas.add(new Persona(5,68,"Javier","Argentina"));
        personas.add(new Persona(6,29,"Gustavo","Brasil"));
        personas.add(new Persona(7,24,"Ana","Italia"));
        personas.add(new Persona(8,32,"Francisco","Francia"));
        personas.add(new Persona(9,90,"Blanca","Irlanda"));
        personas.add(new Persona(10,80,"Miguel","España"));


        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            Characters saltoLinea = eventFactory.createCharacters("\n");
            Characters saltoLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoLinea);

            StartElement personasStartElement = eventFactory.createStartElement("","","personas");
            xmlWriter.add(personasStartElement);
            xmlWriter.add(saltoLinea);

            int longitud = 0;
            /*Vamos a usar este contador para controlar la tabulacion de la primera etiqueta del documento XML*/
            int contador = 0;

            for (Persona p : personas) {
                StartElement personaStart = eventFactory.createStartElement("","","idPersona");
                StartElement edadStart = eventFactory.createStartElement("","","edadPersona");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement paisStart = eventFactory.createStartElement("","","pais");

                Attribute id = eventFactory.createAttribute("dni",Integer.toString(p.getId()));

                EndElement personaEnd = eventFactory.createEndElement("","","idPersona");
                EndElement edadEnd = eventFactory.createEndElement("","","edadPersona");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombrePersona");
                EndElement paisEnd = eventFactory.createEndElement("","","paisPersona");

                Characters identificador = eventFactory.createCharacters(String.valueOf(Integer.valueOf(p.getId())));
                Characters nombre = eventFactory.createCharacters(p.getNombre());
                Characters edad = eventFactory.createCharacters(String.valueOf(Integer.valueOf(p.getEdad())));
                Characters pais = eventFactory.createCharacters(p.getPais());

                /*Añado los elementos de la persona en un orden específico*/
                if (contador < 1) {
                    xmlWriter.add(tabulador);
                    contador++;
                }
                xmlWriter.add(personaStart);

                //Añado el atributo
                xmlWriter.add(id);

                xmlWriter.add(saltoLineaTab);
                xmlWriter.add(tabulador);

                /*Los hijos de cada pedido*/
                xmlWriter.add(personaStart);
                xmlWriter.add(identificador);
                xmlWriter.add(personaEnd);
                xmlWriter.add(saltoLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(edadStart);
                xmlWriter.add(edad);
                xmlWriter.add(edadEnd);
                xmlWriter.add(saltoLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(nombreStart);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEnd);
                xmlWriter.add(saltoLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(paisStart);
                xmlWriter.add(pais);
                xmlWriter.add(paisEnd);

                xmlWriter.add(personaEnd);

                if (longitud == personas.size() - 1) {
                    xmlWriter.add(saltoLinea);
                } else {
                    xmlWriter.add(saltoLineaTab);
                }

                longitud++;
            }

            EndElement personasEndElement = eventFactory.createEndElement("","","personas");
            xmlWriter.add(personasEndElement);
            xmlWriter.add(saltoLinea);

            /*Creo el elemento para finalizar el documento y lo escribo en el objeto escritor*/
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }

    }
}
