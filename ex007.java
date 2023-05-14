import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.print("Idade da " + i + " pessoa: ");
            int idade = input.nextInt();

            total += idade;

        }

        System.out.println("A media das idades e de: " + total / 20);
    }
}
