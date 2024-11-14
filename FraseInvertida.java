import java.util.Scanner;

public class FraseInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        sc.nextLine();
        char[] letras =  sc.nextLine().toCharArray();
        char[] letrasInvertidas = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            letrasInvertidas[i] = letras[letras.length - 1 - i];
        }
        System.out.println(letrasInvertidas);
        System.out.println(new String(letrasInvertidas));



    }
}
