import static java.lang.String.*;

public class Parentesis {
    public static boolean cuanParentesis (String num1) {
        int c = 0;

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == '('){
                c++;
            }
            else if (num1.charAt(i) ==')'){
                c--;
            }if (c < 0) {
                return false;

            }

        }
    return c == 0;
    }

    public static void main(String[] args) {
    String num1 = "(a(((9)))))";

        System.out.println(cuanParentesis(num1));




    }

}
