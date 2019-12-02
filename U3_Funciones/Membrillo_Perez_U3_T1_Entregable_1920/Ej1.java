package Membrillo_Perez_U3_T1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numClientes;

        int[] ocupacion = new int[10];

        for (int i = 0; i < ocupacion.length; i++) { //Asignamos valores
            ocupacion[i] = (int) (Math.random() * 5); //Generamos numeros aleatorios del 0 al 5
        }
        int contador=0;

        do {
            System.out.print("    Mesas: ");
            for (int i = 1; i <= ocupacion.length; i++) {
                System.out.print(i+" ");
            }
            System.out.println();

            System.out.print("Ocupacion: ");
            for (int i = 0; i < ocupacion.length; i++) { //Mostramos la tabla
                System.out.print(ocupacion[i] + " ");
            }
            System.out.println();

            System.out.println("¿Cuántos son (pulse -1 para salir del programa)?");
            numClientes = sc.nextInt();

            if (numClientes < -1) {
                System.out.println("No puede ser un numero negativo");
            } else if (numClientes > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + numClientes + ", haga grupos de 4 personas como máximo e intente de nuevo");
            } else if (numClientes == -1) {
                System.out.println("Gracias, hasta pronto");
                break;
            }

            boolean vacio=false;
            int posicionVacia=0;

            /*Aquí comprobamos si hay alguna mesa vacia y guardamos su posicion*/
            for (int i = 0; i < ocupacion.length; i++) {
                if (ocupacion[i]==0) {
                    vacio=true;
                    posicionVacia=i;
                    break;
                }
            }

            for (int i = 0; i < ocupacion.length; i++) {
                if (ocupacion[i] + numClientes <= 4) {
                    /*Si no hay mesas vacias tienen que compartir mesa*/
                    if (!vacio) {
                        System.out.print("Tendrán que compartir mesa. ");

                        System.out.println("Por favor, siéntese en la mesa "+(i+1));
                        ocupacion[i]+=numClientes;
                        break;
                    } else {
                        System.out.println("Por favor, siéntese en la mesa "+(posicionVacia+1));
                        ocupacion[posicionVacia]+=numClientes;
                        break;
                    }

                } else {
                    contador++;
                }

            }

            if (contador==10) {
                System.out.println("Lo siento, en estos momento no queda sitio");
            } else {
                contador=0;
            }
            System.out.println();

        } while (numClientes!=-1);

    }
}
