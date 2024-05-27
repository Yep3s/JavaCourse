package Operadores;

import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número entero: ");
        int num2 = teclado.nextInt();


        int numeroMayor = num1 > num2 ? num1 : num2;

        System.out.println("El Numero Mayor Es: " + numeroMayor);

    }

}
