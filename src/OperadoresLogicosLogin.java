import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

           /*String[] usernames = new String[3];
            String[] passwords = new String[3];
            usernames[0] = "Jony";
            passwords[0] = "042698";

            usernames[1] = "Admin";
            passwords[1] = "1234";

            usernames[2] = "pepe";
            passwords[2] = "12345";*/

            String[] usernames = {"Jony", "Admin", "Pepe"};
            String[] passwords = {"042698", "123", "12345"};

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese usuario");

            String u = scanner.next();

            System.out.println("Ingrese contraseña");
            String p = scanner.next();

            boolean esAutenticado = false;

            for(int i = 0; i < usernames.length; i++){

                esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;

                /*if(usernames[i].equals(u) && passwords[i].equals(p)){
                    esAutenticado = true;
                    break;
                }*/
            }

            String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!"): "Username o password incorrecto!";
        System.out.println("mensaje = " + mensaje);

            /*if(esAutenticado){
                System.out.println("Bienvenido usuario ".concat(u).concat("!"));
            } else {
                System.out.println("Username o password incorrecto!");
            }*/
    }
}
