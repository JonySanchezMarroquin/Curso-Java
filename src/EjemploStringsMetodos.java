public class EjemploStringsMetodos {
    public static void main(String[] args) {

        String nombre = "Jony";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Jony\") = " + nombre.equals("jony"));
        System.out.println("nombre.equalsIgnoreCase(\"jony\") = " + nombre.equalsIgnoreCase("jony"));
        System.out.println("nombre.compareTo(\"Jony\") = " + nombre.compareTo("Jony"));
        System.out.println("nombre.compareTo(\"Dany\") = " + nombre.compareTo("Dany"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 2));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
    }
}
