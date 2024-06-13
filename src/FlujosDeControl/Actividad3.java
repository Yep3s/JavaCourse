package FlujosDeControl;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa El Primer Numero: ");
        Integer numero1 = teclado.nextInt();

        System.out.println("Ingresa El Segundo Numero: ");
        Integer numero2 = teclado.nextInt();

        Integer resultado = 0;

        for (int i = 0; i < numero2; i++) {
            resultado += numero1;
        }

        System.out.println("El Resultado De La Multiplicacion Es: " + resultado);

    }

}
