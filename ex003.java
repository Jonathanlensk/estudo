import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = input.nextLine();

        for (int i = 0; i <= 15; i++) {
            System.out.println(name);
        }

    }
}
