package FlujosDeControl;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();
        int menor = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            if (i == 0) {
                menor = numero;
            } else {
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        System.out.println("El número menor es: " + menor);
        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }


    }

}
