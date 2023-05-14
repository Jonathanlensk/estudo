
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float valordoProduto;
        float porcentagemdeDesconto;
        float valordoDesconto;
        float valorComDesconto;

        System.out.print("Digite o valor do produto:");
        valordoProduto = scan.nextFloat();

        System.out.print("Digite a porcentagem de desconto: ");
        porcentagemdeDesconto = scan.nextFloat();

        valordoDesconto = (porcentagemdeDesconto / 100) * valordoProduto;
        valorComDesconto = valordoProduto - valordoDesconto;

        System.out.printf("O desconto é de R$ %.2f e o valor do produto com desconto é de R$ %.2f", valordoDesconto, valorComDesconto);
    }

}
