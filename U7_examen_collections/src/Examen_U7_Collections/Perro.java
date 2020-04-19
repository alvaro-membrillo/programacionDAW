package examenCollections;

public class Perro extends Propietario {

    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunado;
    //private String raza;
    private Raza raza;
    Propietario p;

    public Perro () {
        this.nombre = "Toby";
        this.edad = 6;
        this.peso = 30;
        this.vacunado = true;
        this.raza = Raza.PASTOR_ALEMAN;
        this.p = p;
    }

    public Perro(String nombre, int edad, int peso, boolean vacunado,
                 Raza raza, Propietario p) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.raza = raza;
        this.p = p;
    }


    public String getNombrePerro() {
        return nombre;
    }

    public void setNombrePerro(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Propietario getP() {
        return p;
    }

    public void setP(Propietario p) {
        this.p = p;
    }
}
