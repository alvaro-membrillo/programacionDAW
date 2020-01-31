package PruebaHerenciaInterfaces1920_mañana;

import java.util.Comparator;

public class CompararAnyo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Terrestre t1 = (Terrestre) o1;
        Terrestre t2 = (Terrestre) o2;
        return t1.getAnyoFabricacion()-t2.getAnyoFabricacion(); //Queremos comparar por año de fabricacion
    }
}
