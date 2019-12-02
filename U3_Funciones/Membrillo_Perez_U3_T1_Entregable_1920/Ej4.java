package Membrillo_Perez_U3_T1;

public class Ej4 {
    public static String convierteArrayEnString(int[] a) {
        String array="";

        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0) {
                array+=a[i];
            }

        }

        return array;
    }

    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }

        System.out.println(convierteArrayEnString(a));
    }
}
