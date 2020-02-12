import java.util.Arrays;

public class Guerrero extends Hombre implements Atacar {

    private int edad;

    public Guerrero(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados, int edad) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "edad=" + edad +
                ", personajes=" + Arrays.toString(listaPersonajes) +
                '}';
    }

    @Override
    public String atacarPersonaje(Personaje p) {
        super.atacarPersonaje(p);
        return "Guerrero atacando";
    }
}
