import java.util.Scanner;

public class ex0015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int nDaVez = 0;

        System.out.println("Digite um numero: ");
        int nUser = input.nextInt();

        for (int i = 1; i <= nUser; i++) {
            if (i <= nUser) {
                total += 1 + i;

                System.out.print("1 + " + i + "/");
            }
        }

        System.out.print(" = " + total);

    }
}
