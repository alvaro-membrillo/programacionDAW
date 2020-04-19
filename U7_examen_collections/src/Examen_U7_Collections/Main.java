package examenCollections;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Propietario pr1 = new Propietario();
        Propietario pr2 = new Propietario();
        Propietario pr3 = new Propietario();

        Perro sb1 = new Perro("San bernardo 1", 12, 60, false,
                Raza.SAN_BERNARDO, pr2);
        Perro sb2 = new Perro("San bernardo 2", 13, 50, true,
                Raza.SAN_BERNARDO, pr1);
        Perro sb3 = new Perro("San bernardo 3", 20, 70, false,
                Raza.SAN_BERNARDO, pr1);
        Perro pa1 = new Perro("Pastor Aleman 1", 10, 25, true, Raza.PASTOR_ALEMAN, pr3);
        Perro pa2 = new Perro("Pastor Aleman 2", 7, 30, true, Raza.PASTOR_ALEMAN, pr3);
        Perro pa3 = new Perro("Pastor Aleman 3", 4, 27, true, Raza.PASTOR_ALEMAN, pr3);
        Perro l1 = new Perro("Labrador 1", 6, 14, false, Raza.LABRADOR, pr2);
        Perro l2 = new Perro("Labrador 2", 5, 10, false, Raza.LABRADOR, pr2);
        Perro l3 = new Perro("Labrador 3", 9, 45, false, Raza.LABRADOR, pr1);
        Perro l4 = new Perro("Labrador 4", 10, 50, true, Raza.LABRADOR,pr1);


        Map<String, Perro> perros = new HashMap<>();

        Concurso c = new Concurso("ConcursoCanino", "Sevilla", perros);

        System.out.println(c.addDog(Raza.LABRADOR, l1));
        System.out.println(c.addDog(Raza.PASTOR_ALEMAN, pa2));
        System.out.println(c.addDog(Raza.SAN_BERNARDO, pa1));
        System.out.println(c.addDog(Raza.LABRADOR, l3));
        System.out.println(c.addDog(Raza.PASTOR_ALEMAN, sb1));
        System.out.println(c.addDog(Raza.PASTOR_ALEMAN, sb3));
        System.out.println(c.addDog(Raza.PASTOR_ALEMAN, pa2));
        System.out.println(c.addDog(Raza.SAN_BERNARDO, sb2));
        System.out.println(c.addDog(Raza.LABRADOR, l4));
        System.out.println(c.addDog(Raza.PASTOR_ALEMAN, pa3));
        System.out.println(c.addDog(Raza.SAN_BERNARDO, sb1));


    }
}
