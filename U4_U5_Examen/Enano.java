import java.util.Arrays;

public class Enano extends Personaje implements Atacar {

    private float altura;

    public Enano(String nombre, int energia, int capAtaque, int capDefensa,
                 boolean encantados, int altura) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Enanos{" +
                "altura=" + altura +
                ", personajes=" + Arrays.toString(listaPersonajes) +
                '}';
    }

    @Override
    public String atacarPersonaje(Personaje p) {
        return "Gimli atacando";
    }
}
