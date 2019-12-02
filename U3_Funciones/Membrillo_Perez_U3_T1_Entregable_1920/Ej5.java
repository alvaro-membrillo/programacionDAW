package Membrillo_Perez_U3_T1;

public class Ej5 {
    public static int aleatorioDeArray(int[] a) {
        int num;
        int indice;

        indice = (int) (Math.random() * a.length);
        num = a[indice];

        return num;
    }

    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();

        System.out.println("Mostramos un numero aleatorio dentro del array");
        System.out.println(aleatorioDeArray(a));
    }
}
