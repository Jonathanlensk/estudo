package aula3;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Digite a sua altura (em metros): ");
        double altura = scan.nextDouble();

        System.out.print("Digite o seu peso (em kg): ");
        double peso = scan.nextDouble();

        if (idade >= 18 && idade <= 35 && altura >= 1.65 && peso <= 100) {
            System.out.println("Voce esta dentro dos limites para testar o prototipo de aviao.");
        } else {
            System.out.println("Voce nao esta dentro dos limites para testar o prototipo de aviao.");
        }
    }
}
