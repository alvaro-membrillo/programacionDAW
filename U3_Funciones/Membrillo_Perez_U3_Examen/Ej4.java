package com.company;

import java.util.Arrays;

public class Ej4 {
    public static int[] filtraPrimos(int[] array) {
        int numPrimos = array.length;
        int contador = 0;
        int[] auxiliar = new int[array.length];
/*NO ES NECESARIO CREAR UN CONTADOR PARA SABER EL NUMERO DE NUMEROS PRIMOS, CON INDICAR QUE SI EL NUMERO ES 1 ES PRIMO Y QUE TRAS DIVIDIR UN NUMERO ENTRE SUS NUMEROS ANTERIORES DESDE EL DOS HASTA UN NUMERO MENOR DEL QUE BUSCAMOS, SI EL RESTO ES 0 NO ES PRIMO PORQUE QUIERE DECIR QUE HABRÁ UN NUMERO DIVISIBLE ENTRE ELLOS*/

        for (int i = 0; i < array.length; i++) {
            for (int j = array[i]; j > 0; j--) {
                if (array[i] % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) { //Si el numero es primo lo metemos dentro de la tabla auxiliar
                auxiliar[i] = array[i];
            } else { //Si no es primo restamos 1 a la cantidad total de primos, que comienza teniendo el valor del tamaño del array
                numPrimos--;
            }

            contador = 0;
        }

        int[] primos = new int[numPrimos];

        for (int i = 0; i < array.length; i++) {
            if (numPrimos == 0) {
                primos[i] = -1;
            } else if (i < numPrimos) {
                primos[i] = auxiliar[i];
            } else {
                break;
            }
        }

        return primos;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
	
	/*EN la main solo hay que declarar la variable y llamar a la función así --> System.out.println(Arrays.toString(filtraPrimos(datos)));*/
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Los numeros primos son: " + Arrays.toString(filtraPrimos(array)));
    }
}
