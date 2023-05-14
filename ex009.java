import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.println("Digite um numero: ");
            int nDigitado = input.nextInt();

            if (nDigitado % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
 
        }

        System.out.println("Dos seus numeros digitados sao pares: " + pares);
        System.out.println("Dos seus numeros digitados sao impares: " + impares);

        
    }
}
