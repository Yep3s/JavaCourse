package Operadores;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Double maximoGas = 70.0;

        System.out.println("Ingrese El Nivel Actual De Gasolina En El Tanque: ");
        Double gasolinaActual = teclado.nextDouble();

        if (gasolinaActual >= maximoGas){
            System.out.println("Tanque lleno De Gasolina");
        } else if (gasolinaActual > 59.99 && gasolinaActual < 70.0) {
            System.out.println("Tanque Casi Lleno De Gasolina");
        } else if (gasolinaActual > 39.99 && gasolinaActual < 60.0) {
            System.out.println("Tanque 3/4 De Gasolina");
        } else if (gasolinaActual > 34.99 && gasolinaActual < 40.0) {
            System.out.println("Medio Tanque De Gasolina");
        } else if (gasolinaActual > 19.99 && gasolinaActual < 35.0) {
            System.out.println("Gasolina Suficiente");
        }else{
            System.out.println("Gasolina Insuficiente");
        }

    }

}
