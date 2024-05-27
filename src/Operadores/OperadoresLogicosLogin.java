package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Admin";
        passwords[0] = "666";

        usernames[1] = "Oscar";
        passwords[1] = "123";

        usernames[2] = "pepe";
        passwords[2] = "tomate"; */

        String[] usernames = {"Admin", "Oscar", "pepe"};
        String[] passwords = {"666", "123", "tomate"};

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        String u = teclado.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String p = teclado.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){

        esAutenticado = (usernames[i].equals(u ) && passwords[i].equals(p)) ? true : esAutenticado;

           /*
            if(usernames[i].equals(u ) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }*/
        }

         String mensaje = (esAutenticado ) ? "Login Exito" : "Login Fallido";

        System.out.println("Mensaje = " + mensaje);


        /*if (esAutenticado){
            System.out.println("Bienvenido al sistema Usuario: " + u);
            System.out.println("Usuario Y Contraseña Correctos");
        }else {
            System.out.println("USUARIO NO ENCONTRADO O CONTRASEÑA INCORRECTA");
        }*/




    }


}
