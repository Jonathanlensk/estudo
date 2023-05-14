import java.util.Scanner;

public class ex0011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int nUser = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "x" + nUser + " = " + nUser * i);
        }


    }
}
