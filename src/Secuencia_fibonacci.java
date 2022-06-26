public class Secuencia_fibonacci {

    public static void main(String[] args) {
        int primerNumero = 1;
        int segundoNumero = 0;

        System.out.println("numero= 1");

        for (int i = 1; i < 15; i++) {

            int print = segundoNumero + primerNumero;
            System.out.println("numero= " + print);
            primerNumero = print;
            segundoNumero = print - segundoNumero;

        }
    }
}
