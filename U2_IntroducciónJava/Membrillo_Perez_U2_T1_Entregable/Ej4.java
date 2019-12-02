package U2_T1_Entregable_Programación_con_java;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*Crear programa que pinte una flecha doble hacia la izquierda. Se pide
        al usuario la altura de la figura, que debe ser un número impar mayor
        o igual que 3. La distancia entre cada flecha de asteriscos es siempre
        de 5 espacios. Si la altura introducida por el usuario no es un número
        impar mayor o igual que 3, el programa debe mostrar un mensaje de error.*/
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Inserta una altura para la flecha (impar >= 3) -> ");
        int altura = /*sc.nextInt()*/ //7;
        //int mitad = altura / 2;

        /*while (altura % 2 == 0 && altura < 3 || altura % 2 == 0 || altura < 3) {
            System.out.println("Altura incorrecta");
            altura = sc.nextInt();
        }*/

        /*for (int j = altura; j>mitad; j--) {
            for (int i = 0; i<=altura+1; i++) {
                if (i==j+1 || i==(j-(altura-3))) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int j = 0; j<(altura-mitad)-1; j++) {
            for (int i = 0; i<=altura+2; i++) {
                if (i==j+1 || i==(j+(altura-1))) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }*/

        //for (int j = altura; j > mitad; j--) {
        //for (int j = altura; j > mitad; j--) {
            /*for (int i = 0; i <= altura + 1; i++) {
                if ((i == j + 1 for (int j = altura; j > mitad; j--) {|| i == (j - (altura - mitad)) && j < mitad)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }*/
            /*for (int i = 0; i <= altura + 1; i++) {
                if ((i == j + 1 || i == (j - (altura - mitad)) && j < mitad)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }*/

            /*for (int i = mitad; i <= 0; i++) {
                if ((i == j + 1 || i == (j - (altura - mitad))) && j >= mitad) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }*/
            //System.out.println();

        int altura = 0;

        System.out.println("Introduce la altura");
        altura = /*sc.nextInt()*/7;

        while (altura % 2 == 0 || altura<3) {
            System.out.println("Debe ser impar y mayor o igual que 3");
            System.out.println("Pon la altura");
            altura=sc.nextInt();
        }

        /*for (int i = 0; i<altura; i++) {
            for (int j = 0; j<altura; j++) {
                if (i+j==altura/2 || i-j == altura/2) {
                    System.out.print("*-----*");
                } else {
                    System.out.print("-");
                }
            }

        }*/

        for (int i = 0; i<altura; i++) {
            if (i<=altura/2) {
                for (int j = 0; j<(altura/2)-i; j++) {
                    System.out.print("-");
                }
            } else {
                for (int j = altura/2; j<i; j++) {
                    System.out.print("-");
                }
            }
            System.out.println("*-----*");
        }

    }
}
