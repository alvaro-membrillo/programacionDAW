package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*Escribe un programa que pinte por pantalla un par de calcetines, de los
        que se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
        El usuario debe introducir la altura. Suponemos que el usuario introduce una
        altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
        que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.*/
        Scanner sc = new Scanner(System.in);
        int h; //Altura

        do {
            System.out.println("Inserta una altura para los calcetines");
            h= sc.nextInt();
            if (h<4) {
                System.out.println("Altura incorrecta");
            }
        } while (h<4);

        //int mitad=h/2;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 14; j++) {
                if (j<=2 || j>=8 && j<=10) {
                    System.out.print("*");
                } else if (i>=h-2 && (j<6 || j>9)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
