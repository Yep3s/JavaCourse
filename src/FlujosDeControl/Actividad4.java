package FlujosDeControl;

import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\n\tBienvenido Al Menu De Opciones");

        System.out.println("Selecciona Una Opcion: ");

        int opcion = teclado.nextInt();

        System.out.println("1. Actualizar");
        System.out.println("2. Eliminar");
        System.out.println("3. Agregar");
        System.out.println("4. Listar");
        System.out.println("5. Salir");

            do {
                System.out.println("Selecciona Una Opcion: ");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Actualizando...");
                        break;
                    case 2:
                        System.out.println("Eliminando...");
                        break;
                    case 3:
                        System.out.println("Agregando...");
                        break;
                    case 4:
                        System.out.println("Listando...");
                        break;
                    case 5:
                        System.out.println("Haz salido con exito!");
                        break;
                    default:
                        System.out.println("Opcion Invalida");
                        break;
                }
            } while (opcion != 5);




    }
}
