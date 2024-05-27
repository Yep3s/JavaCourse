package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //pre incremento primero incrementa y luego asigna
        int i = 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento primero asigna y luego incrementa

        i = 2;
        System.out.println("valor inicial de i = " + i);

        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //pre decremento primero decrementa y luego asigna

        i = 3;
        System.out.println("valor inicial de i = " + i);

        j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //post decremento primero asigna y luego decrementa

        i = 4;

        System.out.println("i = " + i);

        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++ j));
        System.out.println("j = " + (j++));

        System.out.println("j = " + j);



    }
}
