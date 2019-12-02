package Membrillo_Perez_U3_T1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[4][5];
        int mediaTotal = 0;

        //Asignamos los valores a la tabla inicial
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                //System.out.print("Valor numero --> ");
                tabla[i][j] = /*sc.nextInt()*/(int) (Math.random() * 10);
            }
        }

        int[][] resultado = new int[5][6];
        int mediaH = 0;
        int mediaV = 0;
        /*Igualamos los valores de la primera tabla en la segunda, dejando libre el final de cada
        fila y columna*/
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i <= tabla.length || j <= tabla[i].length) {
                    resultado[i][j] = tabla[i][j];
                }
            }
        }

        /*Igualamos el final de la fila y la columna a la media correspondiente*/
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                if (j < resultado[i].length-1) {
                    mediaH += resultado[i][j];
                } else {
                    resultado[i][j] = mediaH/resultado[i].length-1;
                    mediaH=0;
                }

                if (i < resultado.length-1) {
                    mediaV+=resultado[i][j];
                } else {
                    resultado[i][j] = mediaV/resultado.length-1;
                    mediaV=0;
                }

            }

        }

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

    }
}
