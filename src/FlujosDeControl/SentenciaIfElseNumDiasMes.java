package FlujosDeControl;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        int mes = 2;
        int year = 1992;

        int numeroDiasMes = 0;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDiasMes = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDiasMes = 30;
        } else if (mes ==2) {
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                numeroDiasMes = 29;
            } else {
                numeroDiasMes = 28;
            }
            
        }

        System.out.println("numero de dias = " + numeroDiasMes  );

    }


}
