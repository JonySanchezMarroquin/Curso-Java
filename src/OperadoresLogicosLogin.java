import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

            String userName = "Jony";
            String password = "042698";

            String userName2 = "Admin";
            String password2 = "1234";

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese usuario");

            String u = scanner.next();

            System.out.println("Ingrese contraseña");
            String p = scanner.next();

            boolean esAutenticado = false;

            if( (userName.equals(u) && password.equals(p)) ||
                    ((userName2.equals(u) && password2.equals(p))) ){
                esAutenticado = true;
            } else {
                System.out.println("Username o password incorrecto");
            }

            if(esAutenticado){
                System.out.println("Bienvenido usuario ".concat(u).concat("!"));
            } else {
                System.out.println("Lo siento, requiere autenticacion");
            }
    }
}
