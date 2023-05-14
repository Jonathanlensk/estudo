import java.util.Scanner;

public class ex0012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        int zero = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite um numero: ");
            int nDigitado = input.nextInt();

            if (nDigitado > 0) {
                positivo++;
            } else if (nDigitado < 0) {
                negativo++;
            } else {
                zero++;
            }

        }

        System.out.println("Numero positivos: " + positivo);
        System.out.println("Numeros negativos: " + negativo);
        System.out.println("Numeros iguais a zero: " + zero);

    }
}
