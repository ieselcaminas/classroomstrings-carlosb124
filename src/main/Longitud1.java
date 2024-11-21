public class Longitud1 {
    public static void main(String[] args) {


        String cadenas = "esto es una frase";
        String[] palabras = cadenas.split("");
        int longituddeseada = 4;

        System.out.println(extracted(palabras, longituddeseada));
    }

    public static int extracted(String[] palabras, int longituddeseada) {
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longituddeseada) {
                contador++;
            }

        }
        return contador;
    }
}



