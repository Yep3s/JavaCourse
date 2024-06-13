package FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 12: ");

        Integer number = teclado.nextInt();

        String nombreMes = null;

        switch (number){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Mes Indefinido!";

        }

        System.out.println("El mes es: " + nombreMes);


        switch (number){
            case 0 :
                System.out.println("El número es 0");
            case 1:
                System.out.println("El número es 1");
                break;
            case 2:
                System.out.println("El número es 2");
                break;
            case 3:
                System.out.println("El número es 3");
                break;
            default:
                System.out.println("ELeccion Incorrecta!");

        }

        String name = "Yepes";

        switch (name){
            case "Yepes":
                System.out.println("El nombre es Yepes");
                break;
            case "Juan":
                System.out.println("El nombre es Juan");
                break;
            case "Oscar":
                System.out.println("El nombre es Oscar");
                break;
            default:
                System.out.println("Nombre Incorrecto!");
        }


    }
}
