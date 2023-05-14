package aula3;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero: ");

        int numero = scan.nextInt();

        int mult = numero * 3;

        System.out.println("o triplo desse valor e: " + mult);

    }

}
