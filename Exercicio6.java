
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pontosdoLider;
        int pontosdoLanterna;
        int vitoriasNecessarias;

        System.out.print("Digite a quantidade de pontos do l�der: ");
        pontosdoLider = scan.nextInt();

        System.out.print("Digite a quantidade de pontos do lanterna: ");
        pontosdoLanterna = scan.nextInt();

        vitoriasNecessarias = (pontosdoLider - pontosdoLanterna);

        System.out.printf("Para que o time lanterna alcance (ou ultrapasse) o l�der, s�o necess�rias %d vit�rias.", vitoriasNecessarias);
    }

}
