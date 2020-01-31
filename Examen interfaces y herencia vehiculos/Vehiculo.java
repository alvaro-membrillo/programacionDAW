package PruebaHerenciaInterfaces1920_mañana;

public abstract class Vehiculo {

    private String nombre;
    private int maxPersonas;
    private int numPersonas = 0;

    public Vehiculo(String nombre, int maxPersonas) {
        this.nombre = nombre;
        this.maxPersonas = maxPersonas;
    }

    public boolean transportar(int numPersonas) {
        if (numPersonas <= maxPersonas) {
            this.numPersonas += numPersonas;
            return true;
        }

        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int capacidadPersonas) {
        this.maxPersonas = capacidadPersonas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }
}
