package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFav;
        String cadNums = "";
        System.out.println("Inserta tus tres numeros favoritos");

        for (int i = 0; i < 3; i++) {
            do {
                System.out.print((i+1)+"º número --> ");
                numFav=sc.nextInt();
                if (numFav<0 || Integer.toString(numFav).length()!=1) {
                    System.out.println("Tiene que ser positivo y de una cifra");
                }
                cadNums+=numFav;
            } while (numFav<0 || Integer.toString(numFav).length()!=1);
        }

        int numLoteria;

        do {
            System.out.print("Introduce el numero de la lotería (debe tener cinco cifras): ");
            numLoteria = sc.nextInt();
            if (numLoteria<0 || Integer.toString(Integer.parseInt(Integer.toString(numLoteria))).length()!=5) {
                System.out.println("Tiene que ser positivo y de 5 cifras");
            }
        } while (numLoteria<0 || Integer.toString(Integer.parseInt(Integer.toString(numLoteria))).length()!=5);

        String cadLoteria = Integer.toString(numLoteria);
        int longitud = Integer.toString(Integer.parseInt(Integer.toString(numLoteria))).length();
        int suerte=0; //Numero de numeros que coinciden en ambas cadenas

        for (int i = 0; i < cadNums.length(); i++) {
            for (int j = 0; j < longitud; j++) {
                if (cadNums.charAt(i) == cadLoteria.charAt(j)) {
                    suerte++;
                }
            }
        }

        if (suerte>cadLoteria.length()/2) {
            System.out.println("Vas a tener suerte");
        } else {
            System.out.println("No vas a tener suerte");
        }
    }
}
