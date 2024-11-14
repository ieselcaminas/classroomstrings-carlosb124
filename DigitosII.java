public class DigitosII {
    public static boolean esNumero (String cadena){
        int contador = 0;
        boolean esNumero = true;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                contador++;
            }
        }
        if (contador == cadena.length()){
            esNumero = true;
        }else{
            esNumero = false;
        }
        return esNumero;


    }
    public static boolean esUnnumeroPalabra (String palabra){
        for (int i = 0; i < palabra.length(); i++) {
            if (!Character.isDigit(palabra.CharAt(j)))

        }

    }

    public static void main(String[] args) {
        System.out.println(esNumero("123456789"));
        System.out.println(esNumero("123456789a"));

    }

}
