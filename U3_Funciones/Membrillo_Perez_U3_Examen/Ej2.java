package com.company;

import java.util.Arrays;

public class Ej2 {
    public static int[] insertarValor(int[] vector, int valor, int posicion) {
        int[] resultado = new int[vector.length+1];

        for (int i = 0; i < resultado.length; i++) {
            if (i == resultado.length-1) {
                resultado[i]=0;
            } else {
                resultado[i]=vector[i];
            }
        }

        for (int i = resultado.length; i >= posicion; i--) {
            resultado[i+1] = resultado[i];
            resultado[i]=0;
        }

        Arrays.toString(resultado);

        return resultado;
    }

    public static void main(String[] args) {
        int[] vector = new int[5];

        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 4;
        vector[4] = 5;

        System.out.println(Arrays.toString(insertarValor(vector, 6, 2)));

    }
}
