package com.company;

import java.util.Scanner;

public class Ej1 {
    public static int maxMatriz(int[][] vector) {
        int mayor = 0;
/**/

        for (int i = 0; i < vector.length; i++) { //recorremos el vector
            for (int j = 0; j < vector[i].length; j++) {
                for (int k = i; k >= 0; k--) {
                    for (int l = j; l >= 0; l--) {
                        if (vector[k][l]>vector[i][j]) {
                            mayor = vector[k][l];
                        }
                    }
                }
            }
        }

        /*for (int i = vector.length; i > 0; i--) { //recorremos el vector
            for (int j = vector[i].length; j > 0; j--) {
                for (int k = 0; k < i; k++) {
                    for (int l = 0; l < j; l++) {
                        if (vector[i][j]>vector[k][l]) {
                            mayor = vector[i][j];
                        }
                    }
                }
            }
        }*/

        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas;
        int numColumnas;
/*Indicamos la altura y anchura, declaramos el la matriz y le asignamos valores, mostramos la matriz y llamamos a la matriz*/

        do {
            System.out.print("Inserta el numero de filas de la matriz: ");
            numFilas = /*sc.nextInt()*/4;

            System.out.print("Inserta el numero de columnas de la matriz: ");
            numColumnas = /*sc.nextInt()*/5;

            if (numFilas < 0 || numColumnas < 0) {
                System.out.println("No puede ser un numero negativo");
            }
        } while (numFilas < 0 || numColumnas < 0);

        int[][] vector = new int[numFilas][numColumnas];

        System.out.println();

        for (int i = 0; i < vector.length; i++) { //Asignamos valores al vector
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int) (Math.random() * 1000);
            }
        }

        for (int i = 0; i < vector.length; i++) { //Mostramos el vector
            for (int j = 0; j < vector[i].length; j++) {
                System.out.print(vector[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("El mayor numero del vector es " + maxMatriz(vector));

    }
}
