package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        int j = +i; // j = -5  (el signo + no hace nada)

        System.out.println("i = " + i);

        int k = -i; // k = 5
        System.out.println("k = " + k);

        i = 6;
        j = +i;

        System.out.println("j = " + j);

        k = -i;
        System.out.println("k = " + k);

    }
}
