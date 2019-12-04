package Examen_recu_tercer_tema;

import java.util.Arrays;
import java.util.Scanner;

public class U3Ej1 {
    public static float[] mediaVectores(int[] v1, int[] v2) {
        int tam = 0;
        boolean v1EsMayor = false;
        if (v1.length > v2.length) {
            tam = v1.length;
            v1EsMayor = true;
        } else {
            tam = v2.length;
        }

        float[] vMedia = new float[tam];

        for (int i = 0; i < tam; i++) {
            if (v1EsMayor) {
                if (i < v2.length) {
                    vMedia[i] = (v1[i] + v2[i])/2;
                } else {
                    vMedia[i] = v1[i];
                }
            } else {
                if (i < v1.length) {
                    vMedia[i] = (v1[i] + v2[i])/2;
                } else {
                    vMedia[i] = v2[i];
                }
            }
        }

        return vMedia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un tamaño para el primer vector");
        int tam = sc.nextInt();

        int[] v1 = new int[tam];
        System.out.println("Asigna valores al primer vector");
        for (int i = 0; i < v1.length; i++) {
            System.out.print((i + 1) + "º valor = ");
            v1[i] = sc.nextInt();
        }

        System.out.println("Inserta un tamaño para el segundo vector");
        tam = sc.nextInt();
        int[] v2 = new int[tam];
        for (int i = 0; i < v2.length; i++) {
            System.out.print((i + 1) + "º valor = ");
            v2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mediaVectores(v1, v2)));
    }
}
