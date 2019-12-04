package Examen_recu_primeraEv;

import java.util.Scanner;

public class U2Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha = ""/*sc.nextLine()/*"18/07/2000"*/; //    dd/mm/aaaa

        /*System.out.println("dia="+fecha.substring(0,2));
        System.out.println("mes="+fecha.substring(3,5));
        System.out.println("año="+fecha.substring(6,fecha.length()));*/

        do {
            System.out.println("Dame un día, mes y año");
            fecha = sc.nextLine();
            int dia = Integer.parseInt(fecha.substring(0, 2));
            int mes = Integer.parseInt(fecha.substring(3, 5));
            int year = Integer.parseInt(fecha.substring(6, fecha.length()));
            //System.out.println(dia+"/"+mes+"/"+year);
            dia++;

            switch (mes) {
                case 1: //Enero, 31 días
                    if (dia > 31) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 2: //Febrero, 28 días
                    if (dia > 28) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 3: //Marzo, 31 días
                    if (dia > 31) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 4: //Abril, 30 días
                    if (dia > 30) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 5: //Mayo, 31 días
                    if (dia > 31) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 6: //Junio, 30 días
                    if (dia > 30) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 7: //Julio, 31 días
                    if (dia > 31) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 8: //Agosto, 31 días
                    if (dia > 31) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 9: //Septiembre, 30 días
                    if (dia > 30) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 10: //Octubre, 31 días
                    if (dia > 31) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 11: //Noviembre, 30 días
                    if (dia > 30) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 12: //Diciembre, 31 días
                    if (dia > 31) {
                        mes = 1;
                        dia = 1;
                        year++;
                    }
                    break;
                default:
                    System.out.println("Ese mes no existe");
                    break;
            }

            System.out.println("El siguiente día es el " + dia + "/" + mes + "/" + year);
        } while (fecha != "FIN");

    }
}
