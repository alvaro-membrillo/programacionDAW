package u8_T3_Uso_de_Stax;

public class Persona {
    private int id, edad;
    private String nombre, pais;

    private Persona() {

    }

    Persona(int id, int edad, String nombre, String pais) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
