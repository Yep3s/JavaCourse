package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int [] numeros = {1,3,5,7,9,11,13,15,17,19};

        for(int numero : numeros){
            System.out.println(numero);
        }


        String[] nombres = {"Juan", "Pedro", "Luis", "Ana", "Maria"};

        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }



    }



}
