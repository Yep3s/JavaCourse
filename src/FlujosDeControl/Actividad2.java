package FlujosDeControl;

public class Actividad2 {
    public static void main(String[] args) {

        double nota;
        double sumaNotas = 0;
        double sumaNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        int cantidadNotas1 = 0;
        int cantidadNotas = 0;
        double promedioTotal;
        double promedioNotasMayoresA5;
        double promedioNotasMenoresA4;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
            nota = Double.parseDouble(System.console().readLine());
            if (nota == 0) {
                System.out.println("Error: nota 0 ingresada. Saliendo del programa.");
                break;
            }
            sumaNotas += nota;
            cantidadNotas++;
            if (nota > 5) {
                sumaNotasMayoresA5 += nota;
            } else if (nota < 4) {
                sumaNotasMenoresA4 += nota;
            }
            if (nota == 1) {
                cantidadNotas1++;
            }
        }

        promedioTotal = sumaNotas / cantidadNotas;

        if (sumaNotasMayoresA5 == 0) {
            promedioNotasMayoresA5 = 0;
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / cantidadNotas;
        }

        if (sumaNotasMenoresA4 == 0) {
            promedioNotasMenoresA4 = 0;
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / cantidadNotas;
        }

        System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);

        System.out.println("Promedio de notas menores a 4: " + promedioNotasMenoresA4);

        System.out.println("Cantidad de notas 1: " + cantidadNotas1);

        System.out.println("Promedio total: " + promedioTotal);




    }


}
