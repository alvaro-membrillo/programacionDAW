package POO.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana;

public class Ingrediente {

    private String nombre;
    private int calorias;

    public Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    public Ingrediente(String nombre, int calorias) {
        setNombre(nombre);
        setCalorias(calorias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
