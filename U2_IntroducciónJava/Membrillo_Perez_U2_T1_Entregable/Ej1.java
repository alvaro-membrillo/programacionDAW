package U2_T1_Entregable_Programación_con_java;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*Calcula la nota de un trimestre de la asignatura Programación.
        El programa pedirá las tres notas que ha sacado el alumno en los dos
        primeros controles. Si la media de los dos controles da un número
        mayor o igual a 5, el alumno está aprobado y se mostrará la media y
        la nota correspondiente. Atendiendo a esa media el alumno tendrá
        las siguientes notas:*/
        Scanner sc = new Scanner(System.in);

        /*int n1, n2;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ejemplo " + i);
            System.out.print("Nota del primer control: ");
            n1 = sc.nextInt();
            System.out.print("Nota del segundo control: ");
            n2 = sc.nextInt();
            float media = (n1 + n2) / 2;


            if (media >= 5 && media < 6) {
                System.out.print("Tu nota de programación es " + media + " - ");
                System.out.println("Suficiente");
            } else if (media >= 6 && media < 7) {
                System.out.print("Tu nota de programación es " + media + " - ");
                System.out.println("Bien");
            } else if (media >= 7 && media < 9) {
                System.out.print("Tu nota de programación es " + media + " - ");
                System.out.println("Notable");
            } else if (media < 5) {
                int resultado;
                System.out.println("¿Cuál ha sido el resultado de la recuperación?");
                System.out.println("1- Apto" + '\n' + "2- No apto");
                resultado = sc.nextInt();

                switch (resultado) {
                    case 1:
                        System.out.println("apto");
                        System.out.print("Tu nota de programación es " + media + " - suficiente");
                        media = 5;
                        break;
                    case 2:
                        System.out.println("No apto");
                        System.out.print("Tu nota de programación es " + media + " - ");
                        System.out.println("Suspenso");
                        break;
                    default:
                        System.out.println("Opción inexistente");
                        break;
                }

            } else {
                System.out.println("Sobresaliente");
            }
        }*/

        //CORRECCION

        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float media = 0;

        String rec;

        System.out.println("Introduce un numero");
        n1 = sc.nextFloat();

        System.out.println("Introduce un numero");
        n2 = sc.nextFloat();

        System.out.println("Introduce un numero");
        n3 = sc.nextFloat();

        sc.nextLine(); //para hacer el cambio a leer numeros enteros

        media = (n1 + n2 + n3) / 3;

        if (media >= 5) {
            System.out.println("La media es: " + media+" ");
            if (media >= 5 && media < 6) {
                System.out.println("Suficiente");
            } else if (media > 6 && media < 7) {
                System.out.println("Bien");
            } else if (media >= 7 && media < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }

        } else {
            System.out.println("Nota de la recuperación (apto/no apto)");
            rec = sc.nextLine();

            if (rec.equals("apto")) {
                System.out.println("Suficiente 5");
            } else {
                System.out.println("La media es "+media+" Suspenso");
            }
        }
    }
}
