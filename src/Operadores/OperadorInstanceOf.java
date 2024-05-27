package Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Hola Soy Vegano";

        Integer numero = 10;

        //todas las clases heredan de object

        Boolean b1= texto instanceof Object;

        System.out.println("Texto Es Del Tipo String and Object = " + b1);

        boolean b2  = numero instanceof Number;

        System.out.println("Numero Es Del Tipo Number = " + b2);

        b1 = b1 instanceof Boolean;

        System.out.println("b1 = " + b1);





    }

}
