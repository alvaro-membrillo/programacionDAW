package Examen_recu_tercer_tema;

import java.util.Arrays;

public class U3Ej3 {
    public static String[] invertir (String cadena) {
        String[] invertida = new String[cadena.length()];
        cadena = cadena.toUpperCase();
        int contador=0;

        for (int i = cadena.length()-1; i >= 0; i--) {
            invertida[contador] = String.valueOf(cadena.charAt(i));
            contador++;
        }

        return invertida;
    }

    public static String[] desplazarVocales(String cadena) {
        String[] resultado = new String[cadena.length()];
        char[] vocales = {'a','e','i','o','u'};

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i'
                    || cadena.charAt(i)=='o' || cadena.charAt(i)=='u') {

                cadena.charAt(i) = /*vocales.charAt(i+1)*/;
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        String cadena="hola";
        System.out.println(Arrays.toString(invertir(cadena)));

        System.out.println(Arrays.toString(desplazarVocales(cadena)));
    }
}
