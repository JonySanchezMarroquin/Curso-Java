public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {

        int cantidad = 0;
        char letra = 'g';

        String frase = "trigotres tristes tigres tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;



        buscar:
        for(int i = 0; i <= maxFrase;){
            int k = i;
            for(int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("cantidad = " + cantidad + " veces la palabra " + palabra + " en la frase");
    }
}
