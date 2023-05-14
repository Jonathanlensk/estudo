package aula3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextInt();

        System.out.print("Digite o terceiro numero: ");
        num3 = scan.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.print(num1 + ", ");
            if (num2 <= num3) {
                System.out.print(num2 + ", " + num3);
            } else {
                System.out.print(num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.print(num2 + ", ");
            if (num1 <= num3) {
                System.out.print(num1 + ", " + num3);
            } else {
                System.out.print(num3 + ", " + num1);
            }
        } else {
            System.out.print(num3 + ", ");
            if (num1 <= num2) {
                System.out.print(num1 + ", " + num2);
            } else {
                System.out.print(num2 + ", " + num1);
            }
        }
    }

}
