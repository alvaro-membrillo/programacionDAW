package examenCollections;

import java.util.Map;

public class Concurso extends Perro implements Comparable {

    private String nombreConcurso;
    private String localidad;

    Propietario propietario;

    Map<String, Perro> razas;

    public Concurso(String nombreConcurso, String localidad, Map<String, Perro> razas) {
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
        this.razas = razas;
    }

    public boolean addDog(Raza raza, Perro perro) {

        if (razas.equals(perro.getRaza())) {
            razas.put(raza.toString(), perro);
            return true;
        } else {
            System.out.println("Error, la raza que has introducido no coincide con el campo");
            return false;
        }
    }

    public boolean disqualifyDog(Perro perro) {
        if (razas.containsValue(perro)) {
            razas.remove(perro);
            return true;
        }
        System.out.println("Perro no inscrito");
        return false;
    }

    public boolean ownerDogs() {

        System.out.println("Este socio no tiene perros inscritos");
        return false;
    }

    public Perro[] perrosPorPeso(Raza raza) {
        Perro[] perros = new Perro[razas.size()];

        perros.equals(razas.values());


        return perros;
    }

    @Override
    public int compareTo(Object o) {
        Perro p = (Perro) o;
        return p.getEdad() - p.getEdad();
    }

    /*@Override
    public int compare(Object o, Object t1) {
        Perro p1 = (Perro) o;
        Perro p2 = (Perro) t1;

        return p1.getEdad()-p2.getEdad();
    }*/

    public boolean cargarPerros() {
        boolean res = true;
        try {
            /*ObjectInputStream ois = new ObjectInputStream
                    (new BufferedOutputStream(new FileReader("perros.dat")));*/
        } catch (Exception e) {
            res = false;
            System.out.println(e.getMessage());
        }

        return res;
    }

    /*public boolean guardarPerros() {
        boolean res = true;

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new OutputStream(new File("perros.dat")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            res = false;
        }

        return res;
    }*/


}
