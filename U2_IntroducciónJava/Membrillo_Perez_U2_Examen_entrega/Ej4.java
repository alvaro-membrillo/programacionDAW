package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        int contador=0;

        do {
            System.out.println("Inserta un numero");
            num = sc.nextLong();
            if (num<0) {
                System.out.println("Tiene que ser positivo");
            }
        } while (num<0);

        for (int i = 0; i<5; i++) {
            System.out.print((i+1)+"- El número "+num+" ");
            for (int j = 1; j <= num; j++) {
                //System.out.println(num+"/"+j+"="+(num%j==0));
                if (num%j==0) {
                    contador++;
                }
            }

            if (contador <= 2) {
                System.out.println("es primo");
            } else {
                System.out.println("no es primo");
            }
            contador=0;
            num++;
        }

    }
}
