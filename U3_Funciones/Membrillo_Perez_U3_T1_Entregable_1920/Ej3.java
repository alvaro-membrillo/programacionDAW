package Membrillo_Perez_U3_T1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static int[] filtraCon7(int x[]) {
        int[] y = new int[x.length];
        int longitud = 0;
        String aux;

        for (int i = 0; i < x.length; i++) {
            aux = Integer.toString(x[i]);

            for (int j = 0; j < longitud; j++) {
                /*if (Integer.toString(x[i]).charAt(j)) {
                    y[i]=x[i];
                    break;
                }*/
            }
        }

        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 1000) + 1;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        System.out.println('\n'+"Array y");

        System.out.println(Arrays.toString(filtraCon7(x)));

    }
}
