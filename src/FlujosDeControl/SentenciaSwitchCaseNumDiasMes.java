package FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese El Numero Del Mes Del 1 Al 12: ");
        int mes = teclado.nextInt();

        System.out.println("Ingrese El Año: ");
        int year = teclado.nextInt();

        int numeroDiasMes = 0;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    numeroDiasMes = 31;
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                    numeroDiasMes = 30;
                    break;
            case 2:
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                    numeroDiasMes = 29;
                } else {
                    numeroDiasMes = 28;
                }
                break;
            default:
                numeroDiasMes = 0;
        }




        System.out.println("numero de dias = " + numeroDiasMes  );

    }


}
