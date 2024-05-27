package Operadores;

import javax.swing.*;

public class Actividad3 {
    public static void main(String[] args) {

        String persona1 = JOptionPane.showInputDialog("Introduce el nombre de la primera persona");
        String persona2 = JOptionPane.showInputDialog("Introduce el nombre de la Segunda persona");
        String persona3 = JOptionPane.showInputDialog("Introduce el nombre de la Tercera persona");

        String nombreMasLargo = persona1.length() > persona2.length() ? persona1 : persona2;

        nombreMasLargo = nombreMasLargo.length() > persona3.length() ? nombreMasLargo : persona3;

        JOptionPane.showMessageDialog(null, nombreMasLargo + " Tiene El nombre más largo: ");

    }

}
