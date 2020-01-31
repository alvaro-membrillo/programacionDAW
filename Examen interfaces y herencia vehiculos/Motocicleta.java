package PruebaHerenciaInterfaces1920_mañana;

public class Motocicleta extends Terrestre {

    public Motocicleta(String nombre, int maxPersonas, String matricula, int anyoFabricacion, Color color) {
        super(nombre, maxPersonas, matricula, anyoFabricacion, color);
        this.setMaxPersonas(2);
    }
}
