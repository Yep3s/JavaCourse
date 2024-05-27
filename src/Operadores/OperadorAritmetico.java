package Operadores;

import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5 ,  j = 2,suma = i + j, resta = i - j, multiplicacion = i * j, division = i / j, modulo = i % j;

        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + division);
        System.out.println("modulo = " + modulo);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " es impar");
        }



    }










}
