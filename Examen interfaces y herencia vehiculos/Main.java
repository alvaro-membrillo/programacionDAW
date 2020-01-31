package PruebaHerenciaInterfaces1920_mañana;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Coche[] coches = new Coche[3];

        coches[0] = new Coche("Seat Arosa",4,"97621P",
                2000,Color.AMARILLO);
        coches[1] = new Coche("Citroen Cactus",5,"34234T",
                2015,Color.VERDE);
        coches[2] = new Coche("Tesla Model X",5,"21456E",
                2018,Color.ROJO);

        Motocicleta[] motos = new Motocicleta[3];

        motos[0] = new Motocicleta("Suzuki",2,
                "23431M",2009,Color.AZUL);
        motos[1] = new Motocicleta("KTM",2,"14267K",
                2005,Color.AMARILLO);
        motos[2] = new Motocicleta("Scooter",2,"13435J",
                2017,Color.ROJO);

        Helicoptero h = new Helicoptero("Apache",10,"SE-5352", 500);

        Avioneta a = new Avioneta("Avioneta",4,"FE-3532", 250);


        Arrays.sort(coches);
        System.out.println(Arrays.deepToString(coches));

        Arrays.sort(coches, new CompararAnyo());
        System.out.println(Arrays.toString(coches));


        Arrays.sort(motos);
        System.out.println(Arrays.deepToString(motos));

        Arrays.sort(motos, new CompararAnyo());
        System.out.println(Arrays.toString(motos));

        h.transportar(9);

        System.out.println(h.toString());

    }
}
