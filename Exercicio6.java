package aula3;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero");

        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("numero positivo");
        } else if (num == 0) {
            System.out.println("numero 0");
        } else {
            System.out.println("numero negativo");
        }

    }
}
