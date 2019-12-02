package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;

        do {
            System.out.println("Inserta un numero entero positivo");
            num = /*sc.nextLong()*/6802;
            if (num<0) {
                System.out.println("Numero incorrecto");
            }
        } while (num<0);

        float numDecimal = num;
        float aux=numDecimal;
        System.out.println("Numero introducido --> "+num);
        int cont=0;

        long multiplicador = 10;
        do { //Así obtenemos el numero de digitos que tiene num
            aux=aux/multiplicador;
            cont++;
            //multiplicador*=10;
        } while (aux>=1);

        System.out.println("El numero auxiliar es "+aux);
        System.out.println("num es "+numDecimal);

        //int multiplicador=10;
        //double numFinal=aux;
        int datosEliminados = 0;

        for (int i = 0; i < cont; i++) {
            /*multiplicador*=10;*/
            do {
            aux=aux*multiplicador;
        } while (numDecimal==aux);do {
                aux=aux*multiplicador;
            } while (numDecimal==aux);
        }



        /*for (int i = (int) multiplicador; i > 0; i=i/10) {
            if (aux*i != 8 || aux*i != 0) {
                System.out.println(aux/i);
                numDecimal=aux/i;
            }
        }*/
        /*for (int i = 0; i <= cont; i++) {
            if (aux*10!=8 || aux*10!=0) {
                numFinal = numFinal * 10;
            } else {
                datosEliminados++;
            }
        }*/

        System.out.println("Numero aux: "+/*numFinal*/aux);
        System.out.println("Numero resultado: "+/*numFinal*/numDecimal);
        System.out.println("Digitos eliminados: "+datosEliminados);

    }
}
