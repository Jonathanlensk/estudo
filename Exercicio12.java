package aula3;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float precoTotal = 0;

        System.out.print("Digite o valor do produto 1: ");
        float produto1 = scan.nextFloat();
        precoTotal += produto1;

        System.out.print("Digite o valor do produto 2: ");
        float produto2 = scan.nextFloat();
        precoTotal += produto2;

        System.out.print("Digite o valor do produto 3: ");
        float produto3 = scan.nextFloat();
        precoTotal += produto3;

        System.out.print("Digite a forma de pagamento (1 - dinheiro, 2 - cartao de credito, 3 - debito): ");
        int formaPagamento = scan.nextInt();

        switch (formaPagamento) {
            case 1:
                precoTotal *= 0.95;
                break;
            case 2:
                precoTotal *= 1.1;
                break;
            case 3:

                break;
            default:
                System.out.println("Forma de pagamento invalida.");
                return;
        }

        System.out.println("Preco total da compra: R$" + precoTotal);
    }
}
