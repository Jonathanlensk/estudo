import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maior = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.print("Idade da " + i + " pessoa: ");
            int idade = input.nextInt();

            if (idade >= 18) {
                maior ++;
            }

        }

        System.out.println(maior + " pessoas sao maiores de 18 anos");
        
    }
}
