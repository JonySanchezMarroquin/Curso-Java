public class EjemploStringsMetodosArreglo {
    public static void main(String[] args) {

        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.length() = " + trabalengua.length());
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());

        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }
        System.out.println("\n");
        System.out.println("trabalengua = " + trabalengua.split("a"));

        String [] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;
        for(int j = 0; j < l; j++){
            System.out.println("arreglo2 = " + arreglo2[j]);
        }


        String archivo = "alguna.imagen.pdf";
        String[] archivoArray = archivo.split("\\."); //Se le pone el "\\" para indicar que no es de la expresion regular
        l = archivoArray.length;
        for(int j = 0; j < l; j++){
            System.out.println("arreglo2 = " + archivoArray[j]);
        }
        System.out.println("extension = " + archivoArray[l-1]);
    }
}
