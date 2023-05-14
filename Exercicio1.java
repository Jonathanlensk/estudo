package aula3;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero");
        int x = scan.nextInt();

        System.out.println("digite outro numero");
        int y = scan.nextInt();

        System.out.println("o valor de x = " + x + " valor de y = " + y);

        int a = x;
        x = y;
        y = a;

        System.out.println("o valor de x = " + x + " e o valor de y = " + y);

    }

}
