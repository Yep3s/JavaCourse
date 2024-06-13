package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Juan", "Pedro", "Luis", "Ana", "Maria"};

        int count = nombres.length;

        for(int i = 0; i < count; i++){

            if (nombres[i].equalsIgnoreCase("Luis") || nombres[i].equalsIgnoreCase("Maria")) {
                continue;
            }

            System.out.println(i + "-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
        System.out.println("buscar = " + buscar);


        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El nombre " + buscar + " fue encontrado en el arreglo");
        } else {
            System.out.println("El nombre " + buscar + " no fue encontrado en el arreglo");
        }



    }
}
