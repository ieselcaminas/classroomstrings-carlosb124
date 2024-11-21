public class practica2 {
    public static String invertir(String frase) {
        String[] palabras = frase.split(" ");
        String res = " ";

        for (int i = 0; i < palabras.length; i++) {
            res = palabras[i] + res;

        }
    return res;

    }
}

public static void main(String[] args) {
    System.out.println(practica2.invertir("Hola esto es una frase"));

}