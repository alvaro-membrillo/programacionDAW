package U2_T1_Entregable_Programación_con_java;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String cad = /*sc.nextLine()*/ //"Sample";*/
        //int ancho = (cad.length()*2)-1;
        /*String cadInvert = "";
        for (int z = cad.length() - 1; z >= 0; z--) {
            cadInvert = cadInvert + cad.charAt(z);
        }*/
        //System.out.println(cadInvert);

        //for (int j = 0; j < cadena.length(); j++) {
        /*for (int j; j<=numFilas; j++) {

        }*/
        //for (int i = 0; i < cad.length(); i++) {
            //ancho--;
            //if (inicio >= i && fin <= i) {
             //   System.out.print("-");
           // } else {
          //      System.out.print(cad.substring(0, i));
                //System.out.print(cadInvert.substring(j, cad.length()));
          //  }
            /*System.out.println();


        }*/
        //System.out.println();
        //}

        String palabra = "";

        System.out.println("Introduce una palabra");
        palabra=/*sc.nextLine()*/"Hola";

        for (int i = 0; i<palabra.length()*2-1; i++) {
            if (i<palabra.length()) {

                for (int j = 0; j < palabra.length() - i; j++) {
                    System.out.print("-");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print(palabra.charAt(j));
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(palabra.charAt(j));
                }

            } else {
                /*for () {

                }*/

                for (int j=0; j<(palabra.length()*2)-1-i; j++) {
                    System.out.print(palabra.charAt(j));
                }

                for (int j = palabra.length();; j--) {
                    System.out.print(palabra.charAt(j));
                }
            }

            System.out.println();
        }
    }
}
