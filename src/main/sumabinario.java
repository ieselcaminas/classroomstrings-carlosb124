
public class sumabinario {
    public static void main(String[] args) {
        String num1 = "1010";
        String num2 = "1101";

        String suma = sumarBinario(num1, num2);
        System.out.println("Suma binaria: " + suma);
    }

    public static String sumarBinario(String num1, String num2) {
        String res = "";

        int DigitoA = Integer.parseInt(String.valueOf(num1.charAt(0)));
        char b1;
        char b2;
        int bit1;
        int bit2;
        int acarreo = 0;
        int suma;

        for (int i = num1.length() - 1; i >= 0; i--) {
            b1 = num1.charAt(i);
            b2 = num2.charAt(i);
            bit1 = Integer.parseInt(String.valueOf(b1));
            bit2 = Integer.parseInt(String.valueOf(b2));

            suma = bit1 + bit2 + acarreo;

            if (suma == 0) {
                res = "0" + res;
                acarreo = 0;
            } else if (suma == 1) {
                res = "1" + res;
                acarreo = 0;
            } else {
                res = "1" + res;
                acarreo = 1;
            }
        }
        if (acarreo == 1) {
            res = "1" + res;
        }
        return res;
    }
}