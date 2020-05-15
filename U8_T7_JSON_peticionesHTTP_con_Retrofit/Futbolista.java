package t7_JSON_peticionesHTTP_con_Retrofit;

import java.util.ArrayList;

public class Futbolista {

    //Insertamos los atributos de la clase Futbolista
    private Integer id;
    private int dorsal;
    private String nombre;
    private ArrayList<String> demarcaciones;
    private String equipo;
    private Estadísticas estadísticas;

    //Constructor para crear los objetos
    public Futbolista(int dorsal, String nombre, ArrayList<String> demarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = demarcaciones;
        this.equipo = equipo;
    }

    //Getters y setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getDemarcaciones() {
        return demarcaciones;
    }

    public void setDemarcaciones(ArrayList<String> demarcaciones) {
        this.demarcaciones = demarcaciones;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    //toString para representar los valores
    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", demarcaciones=" + demarcaciones +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
