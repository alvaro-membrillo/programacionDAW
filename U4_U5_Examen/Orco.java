import java.util.Arrays;

public class Orco extends Personaje implements Atacar {

    private int tonelaje;

    public Orco(String nombre, int energia, int capAtaque, int capDefensa,
                boolean encantados, int tonelaje) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Orcos{" +
                "tonelaje=" + tonelaje +
                ", personajes=" + Arrays.toString(listaPersonajes) +
                '}';
    }

    @Override
    public String atacarPersonaje(Personaje p) {
        return "Orco atacando";
    }
}
