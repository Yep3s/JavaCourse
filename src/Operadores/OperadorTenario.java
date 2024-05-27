package Operadores;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadorTenario {
    public static void main(String[] args) {

        // variable = (condicion) ? si es verdadero = valor1 : si es falso = valor2;
        //Operador Tenario
        String variable = (7==8) ? "Si es verdadero" : "No es verdadero";

        System.out.println(variable);

        String estado = "";
        double promedio = 0.0;

        double matematica = 0.0;
        double fisica = 0.0;
        double quimica = 0.0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematica: ");
        matematica = teclado.nextDouble();

        System.out.println("Ingrese la nota de fisica: ");
        fisica = teclado.nextDouble();

        System.out.println("Ingrese la nota de quimica: ");
        quimica = teclado.nextDouble();


        promedio = (matematica + fisica + quimica) / 3;

        System.out.println("El Promedio es  = " + promedio);

        estado = (promedio >= 5.49) ? "Aprobado" : "Reprobado";

        System.out.println("El estado del alumno es: " + estado);

        if (promedio >= 5.49)   {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        //operador tenario es una forma de simplificar el if else






    }

}
