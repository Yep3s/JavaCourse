package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2; // i = i + 2
        System.out.println("i Nueva= " + i);

        i += 5; // i = i + 5
        System.out.println("i Nueva= " + i);

        i -= 2; // i = i - 2
        System.out.println("i Nueva= " + i);

        i *= 3; // i = i * 3
        System.out.println("i Nueva= " + i);

        i /= 2; // i = i / 2
        System.out.println("i Nueva= " + i);

        i %= 2; // i = i % 2
        System.out.println("i Nueva= " + i);


    }
}
