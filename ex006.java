import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.print("Idade da " + i + " pessoa: ");
            int idade = input.nextInt();

            total += idade;
        }

        System.out.println("A soma de todas as idades foi de: " + total);



    }
}
