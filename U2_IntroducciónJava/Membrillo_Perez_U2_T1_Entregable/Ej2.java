package U2_T1_Entregable_Programación_con_java;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*Escribe un programa que diga si un número introducido por teclado
        es o no capicúa. Los números capicúa se leen igual hacia delante y
        hacia atrás. El programa debe aceptar números de cualquier longitud
        siempre que lo permita el tipo, en caso contrario el ejercicio no
        se dará por bueno. Se recomienda usar long en lugar de int ya que el
        primero admite números más largos.*/
        Scanner sc = new Scanner(System.in);
        long numInicial = 0;
        long aux = 0;
        long rev = 0;

        System.out.print("Introduce un número entero positivo: ");
        numInicial = sc.nextInt();

        aux = numInicial;

        while (aux > 0) {
            rev = rev*10 + (aux%10);
            aux = aux /10;
        }

        if (rev == numInicial) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("Pues no");
        }

    }
}
