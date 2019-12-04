package Examen_recu_primeraEv;

import java.util.Scanner;

public class U2Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta una altura para la pirámide: ");
        int altura = /*sc.nextInt()*/5;
        int anchura = 6;

        do {

            if (altura < 3) {
                System.out.println("Error, la altura tiene que ser mayor o igual que 3");
                System.out.println("Vuelve a probar: ");
                altura = sc.nextInt();
            }
        } while (altura < 3);

        System.out.println();
        int base = anchura * 2 + 4;
        int auxMenor = altura;
        int auxMayor = altura + 6;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base/*anchura*2+4*/; j++) {
                if (i % 2 == 0) {
                    if (j >= auxMenor && j < auxMayor) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if ((j > auxMenor-1 && j < auxMenor+2) || (j > auxMayor + 1 && j < auxMayor-2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            auxMenor--;
            auxMayor++;
        }

    }
}
