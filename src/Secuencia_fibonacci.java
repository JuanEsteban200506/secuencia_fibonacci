public class Secuencia_fibonacci {

    public static void main(String[] args) {
        int anterior = 1;
        int anteriorMas = 0;
        for (int i = 1; i < 15; i++) {

            int print = anteriorMas + anterior;
            System.out.println("numero= " + print);
            anterior = print;
            anteriorMas = print - anteriorMas;

        }
    }
}
