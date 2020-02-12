import java.util.Arrays;

public class Rpg {

    Personaje[] listaPersonajes = new Personaje[10];

    public Rpg(Personaje[] listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    private int borrarMuertos() {
        int numMuertos = 0;

        for (int i = 0; i < listaPersonajes.length; i++) {
            if (listaPersonajes[i].getEnergia() <= 0) {
                if (i < listaPersonajes.length) {
                    //sustituimos al personaje
                    listaPersonajes[i] = listaPersonajes[i+1];
                } /*else {
                    listaPersonajes[i] = null; //Borramos el personaje
                }*/
            }
        }

        return numMuertos;
    }

    public String mostarEstado() {
        return Arrays.deepToString(listaPersonajes);
    }

    /*public int mostrarxAtaque() {

    }

    public int mostrarxDefensa() {

    }*/

    public boolean hayGanador() {
        int numVivos = 0;
        boolean ganador = false;

        for (int i = 0; i < listaPersonajes.length; i++) {
            if (listaPersonajes[i].getEnergia() > 0) {
                numVivos++;
            }

            if (numVivos > 1) {
                ganador = false;
            } else {
                ganador = true;
            }
        }

        return ganador;
    }

}
