import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.nextLine();

        System.out.println("Quantas vezes quer que apareca seu nome: ");
        int x = input.nextInt();

        System.out.println("=====================================");

        for (int i = 1; i <= x; i++ ) {
            System.out.println(name);
        }

    }
}
