import java.util.Scanner;

public class ex0013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int nDigitado = input.nextInt();

        int maior = nDigitado;
        int menor = nDigitado;

        for (int i = 0; i <= 9; i++) {
            System.out.println("Digite um numero: ");
            nDigitado = input.nextInt();

            if (nDigitado < menor) {
                menor = nDigitado;
            }

            if (nDigitado > maior) {
                maior = nDigitado;
            }
        

        }

        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("O menor numero digitado foi: " + menor);

    }
}
