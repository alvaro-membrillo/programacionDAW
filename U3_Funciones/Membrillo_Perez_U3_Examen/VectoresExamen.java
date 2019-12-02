package com.company;

public class VectoresExamen {
    public static String[] unir(String[] v1, String[] v2) {
        int longitud = v1.length+v2.length;
        String[] resultado = new String[longitud];

        for (int i = 0; i < longitud; i++) {
            if (i < longitud-v1.length) {
                resultado[i] = String.valueOf(v2[i]);
            } else {
                resultado[i] = String.valueOf(v1[i]);
            }
        }

        return resultado;
    }

    public static int[] rotar(int[] v1, int numPos) {
        int[] resultado = new int[v1.length];

        return resultado;
    }
}
