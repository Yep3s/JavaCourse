package Operadores;

import java.util.Scanner;

public class OperadorTenarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = teclado.nextInt();

        max = (num1 > num2) ? num1 : num2;

        max = (max > num3) ? max : num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("max = " + max);





    }
}
