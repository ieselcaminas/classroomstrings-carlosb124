public class Ejfacil {

    public static double Ordeninverso() {
        int[] h = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String res = "";
        int contador = 0;

        for (int i = 0; i < h.length; i++) {
        contador += i;
        }

        double media = (double) contador / h.length;

        return media;
    }

    public static void main(String[] args) {
        System.out.println(Ordeninverso());
    }
}