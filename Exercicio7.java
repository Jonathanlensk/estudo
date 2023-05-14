package aula3;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O numero" + num1 + " e maior que " + num2);

        } else if (num2 > num1) {
            System.out.println("O numero " + num2 + " e maior que " + num1);
        } else {
            System.out.println("Os numero" + num1 + " e " + num2 + " sao iguais");

        }

    }

}
