package PruebaHerenciaInterfaces1920_mañana;

import java.util.Objects;

public abstract class Terrestre extends Vehiculo implements Comparable {

    private String matricula;
    private int anyoFabricacion;
    private Color color;

    public Terrestre(String nombre, int capacidadPersonas, String matricula, int anyoFabricacion, Color color) {
        super(nombre, capacidadPersonas);
        this.matricula = matricula;
        this.anyoFabricacion = anyoFabricacion;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "nombre=" +
                super.getNombre() +
                ", maxPersonas=" +
                getMaxPersonas() +
                ", NumPersonas=" +
                getNumPersonas() +
                ", matricula='" + matricula + '\'' +
                ", anyoFabricacion=" + anyoFabricacion +
                ", color=" + color +
                '}'+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return matricula.equals(terrestre.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public int compareTo(Object o) {
        Terrestre t = (Terrestre) o;
        return matricula.compareTo(t.matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public Color getColor() {
        return color;
    }
}
