import java.util.Arrays;

public abstract class Personaje implements Atacar {

    private String nombre;
    private int energia; // 0-1000
    private int capAtaque; //0-100
    private int capDefensa; //0-100
    private boolean encantados;

    public Personaje(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados) {
        this.nombre = nombre;
        if (energia < 0 || energia > 1000) {
            this.energia = Integer.parseInt(null);
        } else {
            this.energia = energia;
        }
        if (capAtaque < 0 || capAtaque > 100) {
            this.capAtaque = Integer.parseInt(null);
        } else {
            this.capAtaque = capAtaque;
        }
        if (capDefensa < 0 || capDefensa > 100) {
            this.capDefensa = Integer.parseInt(null);
        } else {
            this.capDefensa = capDefensa;
        }
        this.encantados = encantados;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isEncantados() {
        return encantados;
    }

    public void setEncantados(boolean encantados) {
        this.encantados = encantados;
    }

    public String atacarPersonaje(Personaje p) {
        int energiaFinal;

        if (this.getClass() == p.getClass()) {
            /*Si la clase del atacante es igual a la clase del atacado salimos del
             * metodo atacar porque no le puede hacer daño*/
            return "No puede atacar a un personaje del mismo tipo";
        } else {
            if (isEncantados()) {
                energiaFinal = getEnergia() - (this.capAtaque - p.capDefensa) * 2;
                p.setEnergia(energiaFinal);
            } else {
                energiaFinal = getEnergia() - (this.capAtaque - p.capDefensa);
                p.setEnergia(energiaFinal);
            }
            return "";
        }

    }

}
