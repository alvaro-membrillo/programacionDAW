import java.util.Arrays;

public class Elfo extends Personaje implements Atacar {

    private Tipo tipo;

    public Elfo(String nombre, int energia, int capAtaque, int capDefensa,
                boolean encantados, Tipo tipo) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Elfos{" +
                "tipo=" + tipo +
                ", personajes=" + Arrays.toString(listaPersonajes) +
                '}';
    }

    @Override
    public String atacarPersonaje(Personaje p) {
        return "Legolas Atacando";
    }
}
