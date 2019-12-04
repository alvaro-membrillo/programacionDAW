package Examen_recu_tercer_tema;

import java.util.Scanner;

public class U3Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] tablero = new int[8][8];
        System.out.print("Introduce la posición de la torre (ej: c5) --> ");
        String posicion = /*sc.nextLine()*/"b7";
        int fila = 0;
        int columna = 0;

        int[] codFil = {8, 7, 6, 5, 4, 3, 2, 1};
        char[] codCol = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int[] filaReal = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] colReal = {0, 1, 2, 3, 4, 5, 6, 7};

        int posCol=0;
        int posFil=0;

        for (int i = 0; i < codCol.length; i++) {
            if (codCol[i] == posicion.charAt(0)) {
                posCol=i;
                break;
            }
        }

        for (int i = 0; i < codFil.length; i++) {
            if (codFil[i] == posicion.charAt(1)) {
                posFil=i;
                break;
            }
        }

        System.out.println(colReal[posCol]+"/"+filaReal[posFil]);

        //int[][] pos = new int [columna][fila];
        /*String[] movimientos = new String[tablero.length*2-2];

        int k = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i==columna && j==fila) {
                    movimientos[k] = tablero[fila][columna];
                    k++;
                }
            }
        }*/
        //System.out.println("La torre puede moverse a las siguientes posiciones");
    }
}
