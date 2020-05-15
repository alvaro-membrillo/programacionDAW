package t7_JSON_peticionesHTTP_con_Retrofit;

import java.util.Objects;

public class Estadísticas {

    private int goles;
    private int asistencias;
    private int faltas;

    public Estadísticas(int goles, int asistencias, int faltas) {
        this.goles = goles;
        this.asistencias = asistencias;
        this.faltas = faltas;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estadísticas that = (Estadísticas) o;
        return getGoles() == that.getGoles() &&
                getAsistencias() == that.getAsistencias() &&
                getFaltas() == that.getFaltas();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGoles(), getAsistencias(), getFaltas());
    }

    @Override
    public String toString() {
        return "Estadísticas{" +
                "goles=" + goles +
                ", asistencias=" + asistencias +
                ", faltas=" + faltas +
                '}';
    }
}
