package aula3;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a temperatura atual?: ");
        float temp = scan.nextFloat();

        if (temp > 30) {
            System.out.println("Esta calor ");

        } else if (temp > 15) {
            System.out.println("Esta morno ");

        } else {
            System.out.println("Esta frio ");
        }

    }
}
