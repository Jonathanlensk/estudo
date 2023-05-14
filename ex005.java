import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.print("Escreva seu " + i + " numero: ");
            int nDigitado = input.nextInt();

            total += nDigitado;

        }

        System.out.println("total :" + total);

    }
}
