package com.company;

import java.util.Scanner;

public class Ej3 {
    public static String[] alfil(int[][] tablero, String posicion) {
        String[] movimientos = new String[tablero.length * 2];
        int col = 0;
        int fil = 0;

        if (posicion.charAt(0) == 'a') {
            col = 0;
        } else if (posicion.charAt(0) == 'b') {
            col = 1;
        } else if (posicion.charAt(0) == 'c') {
            col = 2;
        } else if (posicion.charAt(0) == 'd') {
            col = 3;
        } else if (posicion.charAt(0) == 'e') {
            col = 4;
        } else if (posicion.charAt(0) == 'f') {
            col = 5;
        } else if (posicion.charAt(0) == 'g') {
            col = 6;
        } else if (posicion.charAt(0) == 'h') {
            col = 7;
        } else {
            System.out.println("Valor incorrecto para la columna");
        }

        if (posicion.charAt(1) == '1') {
            fil = 0;
        } else if (posicion.charAt(1) == '2') {
            fil = 1;
        } else if (posicion.charAt(1) == '3') {
            fil = 2;
        } else if (posicion.charAt(1) == '4') {
            fil = 3;
        } else if (posicion.charAt(1) == '5') {
            fil = 4;
        } else if (posicion.charAt(1) == '6') {
            fil = 5;
        } else if (posicion.charAt(1) == '7') {
            fil = 6;
        } else if (posicion.charAt(1) == '8') {
            fil = 7;
        } else {
            System.out.println("Valor incorrecto para la fila");
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == j && tablero[i][j] != tablero[fil][col]) {
                    movimientos[i] = String.valueOf(tablero[i][j]);
                }
            }
        }

        for (int i = tablero.length; i > 0; i--) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i + j == tablero.length && tablero[i][j] != tablero[fil][col]) {
                    movimientos[i] = String.valueOf(tablero[i][j]);
                }
            }
        }

        return movimientos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[8][8];
        System.out.println("Inserta la posición del alfil");
        String posicion = /*sc.nextLine()*/"c3";

        System.out.println(alfil(tablero, posicion));
    }
}
