package aula3;

import java.util.Scanner;

public class Exercico3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = scan.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = scan.nextDouble();

        double area = base * altura;

        System.out.println("A area do retangulo e " + area);
    }

}
