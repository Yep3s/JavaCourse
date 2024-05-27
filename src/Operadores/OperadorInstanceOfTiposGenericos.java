package Operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Hola Soy Vegano";

        Number numero = Integer.valueOf(7);//10;

        //todas las clases heredan de object

        Boolean b1= texto instanceof Object;

        System.out.println("Texto Es Del Tipo String and Object = " + b1);

        boolean b2  = numero instanceof Number;

        System.out.println("Numero Es Del Tipo Number = " + b2);

        b1 = b1 instanceof Boolean;

        System.out.println("b1 = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("b1 Texto= " + b1);

        b1 = numero instanceof Long;

        System.out.println("b1 Numero = " + b1);

        b1 = numero instanceof Double;

        System.out.println("b1 Numero Double = " + b1);

        b1 = numero instanceof Integer;

        System.out.println("b1 Numero Integer = " + b1);





    }

}
