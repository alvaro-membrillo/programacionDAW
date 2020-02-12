public class Main {
    public static void main(String[] args) {

        Rpg[] listaPersonajes = new Rpg[10];

        Elfo elfo = new Elfo("Legolas",777,60,
                20,false,Tipo.BOSQUE);

        Orco orco = new Orco("Tomas",200,70,
                50,true,2);

        Enano enano = new Enano("Gimli",2,65,
                40,true,1);

        Mago mago = new Mago("Gandalf",1000,95,
                70,true,2);

        Guerrero guerrero = new Guerrero("Ricardo",200,50,
                80,false,30);

        //Crear al menos 5 personajes
        listaPersonajes[0] = elfo;
        listaPersonajes[1] = orco;
        listaPersonajes[2] = enano;
        listaPersonajes[3] = mago;
        listaPersonajes[4] = guerrero;

        //5 ataques y provocar a algún muerto

        System.out.println(listaPersonajes[2].atacarPersonaje(listaPersonajes[1]));
        System.out.println(listaPersonajes[0].atacarPersonaje(listaPersonajes[1]));
        System.out.println(listaPersonajes[3].atacarPersonaje(listaPersonajes[1]));
        System.out.println(listaPersonajes[4].atacarPersonaje(listaPersonajes[4]));
        System.out.println(listaPersonajes[2].atacarPersonaje(listaPersonajes[4]));

        //System.out.println(listaPersonajes[2].mostarEstado());
        System.out.println(listaPersonajes.mostarEstado());

        //2 encantamientos

        System.out.println(mago.encantar(elfo));
        System.out.println(mago.desencantar(elfo));

        //Mostrar la lista de todos los personajes atendiendo a todos los criterios

    }
}
