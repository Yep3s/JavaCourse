package FlujosDeControl;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.5f;

        if(promedio >= 6.5f){
            System.out.println("Excelente Promedio");

        }else if (promedio >= 6.0f){
            System.out.println("Muy Buen Promedio");

        } else if (promedio >= 5.5f) {
            System.out.println("Buen Promedio");

        } else if (promedio >= 5.0f) {
            System.out.println("Promedio Regular");
        } else if (promedio >= 4.5f) {
            System.out.println("Promedio Bajo");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("Tu Promedio Es = " + promedio);


    }


}
