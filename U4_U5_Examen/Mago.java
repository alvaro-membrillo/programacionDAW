import java.util.Arrays;

public class Mago extends Hombre implements Magia {

    private int longitudBarba;

    public Mago(String nombre, int energia, int capAtaque, int capDefensa,
                boolean encantados, int longitudBarba) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.longitudBarba = longitudBarba;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "longitudBarba=" + longitudBarba +
                ", personajes=" + Arrays.toString(listaPersonajes) +
                '}';
    }

    @Override
    public String atacarPersonaje(Personaje p) {
        return super.atacarPersonaje(p)+"Gandalf atacando";
    }

    @Override
    public boolean encantar(Personaje p) {
        p.setEncantados(true);
        return p.isEncantados();
    }

    @Override
    public boolean desencantar(Personaje p) {
        p.setEncantados(false);
        return p.isEncantados();
    }
}
