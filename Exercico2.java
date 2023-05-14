
import java.util.Scanner;

public class Exercico2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe um numero");
        float num1 = scan.nextFloat();
        System.out.println("informe outro numero ");
        float num2 = scan.nextFloat();

        float soma = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;

        System.out.println("soma: " + soma);
        System.out.println("subitracao: " + sub);
        System.out.println("multiplicacao: " + mult);
        System.out.println("divisao: " + div);

    }

}
