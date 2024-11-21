import java.util.Scanner;

public class Pasatiempos {


public static void main(String[] args) {
    String textoOriginal = "jeandeivid es guapo";
    String textoSinVocales = reemplazarVocales(textoOriginal);
    System.out.println("Texto original: " + textoOriginal);
    System.out.println("Texto modificado: " + textoSinVocales);
}

        public static String reemplazarVocales(String texto) {
            return texto.replaceAll("[aeiouAEIOU]", ".");
        }
}
