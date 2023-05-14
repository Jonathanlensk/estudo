import java.util.Scanner;

public class ex0010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int zeroCem = 0;
        

        for (int i = 0; i <= 20; i++) {
            System.out.println("Digite um numero: ");
            int nDigitado = input.nextInt();

            if (nDigitado >= 0 && nDigitado <= 100) {
                zeroCem++;
            }
        }

        System.out.println("Dos seus numeros digitados: " + zeroCem + " estao entre 0 e 100");
    }
}
