
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("nome");
        String nome = scan.nextLine();
        System.out.println("endereco");
        String endereco = scan.nextLine();
        System.out.println("telefone");
        String telefone = scan.nextLine();
        System.out.println("profissao");
        String profissao = scan.nextLine();

        System.out.println("\n");
        System.out.println("seu nome e: " + nome);
        System.out.println("seu endereco e: " + endereco);
        System.out.println("seu telefone e: " + telefone);
        System.out.println("sua profissao e: " + profissao);
        System.out.println("\n");
    }

}
