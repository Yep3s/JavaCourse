package FlujosDeControl;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;

        boolean condicion = true;

        while (condicion){
            if (i == 7){
                condicion = false;
            }
            System.out.println("i = " + i);
            i++;
        }


        condicion = false;
        do{
            System.out.println("Se ejecuta una sola vez");
        }while (condicion);

        condicion = true;
        i = 0;

        do{
            if(i == 10){
                condicion = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (condicion);


    }

}
