package com.company;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h; int m; int s;
        System.out.println("Inserta la hora");

        do {
            System.out.print("hora: ");
            h=sc.nextInt();
            System.out.print("minutos: ");
            m=sc.nextInt();
            System.out.print("segundos: ");
            s=sc.nextInt();

            if (h<0 || h>=24 || m<0 || m>=60 || s<0 || s>=60) {
                System.out.println("Esa hora no existe");
            }
        } while (h<0 || h>=24 || m<0 || m>=60 || s<0 || s>=60);

        int incrementar;
        do {
            System.out.println("Inserta el numero de segundos que quieres incrementar");
            incrementar = sc.nextInt();

            if (incrementar<0) {
                System.out.println("No puedes poner un numero negativo");
            }
        } while (incrementar<0);

        System.out.println("Aumentando la hora...");

        for (int i = 0; i <= incrementar; i++) {

            s++;

            if (s>=60) {
                s=0;
                m++;
            }
            if(m>=60) {
                m=0;
                h++;
            }
            if (h>=24) {
                h=0;
            }

            //h + ":" + m + ":" + s
            if (Integer.toString(h).length()==1) {
                System.out.print("0"+h);
            } else {
                System.out.print(h);
            }

            if (Integer.toString(m).length()==1) {
                System.out.print(":0"+m);
            } else {
                System.out.print(":"+m);
            }

            if (Integer.toString(s).length()==1) {
                System.out.print(":0"+s);
            } else {
                System.out.print(":"+s);
            }

            System.out.println();
        }

    }
}
