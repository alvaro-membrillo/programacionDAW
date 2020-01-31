package PruebaHerenciaInterfaces1920_mañana;

public abstract class Aereo extends Vehiculo {

    private int altitud;
    private String codigoOACI;

    /*Hay que crear una funcion que devuelva una cadena de texto indicando
     * si es un helicóptero o una avioneta*/

    public Aereo(String nombre, int maxPersonas, String codigoOACI, int altitud) {
        super(nombre, maxPersonas);
        this.altitud = altitud;
        this.codigoOACI = codigoOACI;
        toString();
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "nombre=" +
                getNombre() +
                ", maxPersonas=" +
                getMaxPersonas() +
                ", numPersonas=" +
                getNumPersonas() +
                ", altitud=" + altitud +
                ", codigoOACI='" + codigoOACI + '\'' +
                '}';
    }

    public int getAltitud() {
        return altitud;
    }

    public String getCodigoOACI() {
        return codigoOACI;
    }
}
