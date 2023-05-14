
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de cavalos no haras:");
        float quantidadeCavalos = scan.nextFloat();

        float quantidadeFerraduras = quantidadeCavalos * 4;
        System.out.println("Você vai precisar de " + quantidadeFerraduras + " ferraduras para equipar todos os cavalos.");

    }

}
