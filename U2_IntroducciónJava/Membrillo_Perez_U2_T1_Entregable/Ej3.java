package U2_T1_Entregable_Programación_con_java;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Leer un numero entero positivo y pasarlo a binario*/
        /*System.out.println("Inserta un numero entero positivo");
        int num = /*sc.nextInt()*///28;
        //System.out.print(num + " en binario es --> ");
        /*int resto;

        while (num > 2) {
            //System.out.print(num+"/2 = ");
            resto = num % 2;
            num = num / 2;
            System.out.print(resto);
        }
        resto = num % 2;
        System.out.println(resto);*/

        /*int i;

        if (num % 2 == 0) { //Es par
            i = 1;
        } else {
            i = 0;
        }

        System.out.print(i);
        int resultado;
        while (i <= num) {
            i = i * 2;
            if (i % 2 != 0) {
                i++;
            }
            System.out.print(i);
            /*while () {

            }*/


        /*for (int i = 0; i<num; i=i+2) {
            if (num%2==0) { //es par

            }
        }*/
        //CORRECCION
        int num = 0;
        String cadena = "";

        System.out.println("Introduce el numero a convertir");
        num = sc.nextInt();

        while(num>0) {
            cadena = (num%2) + cadena;
            num = num/2;
        }

        System.out.println(cadena);
    }

}
