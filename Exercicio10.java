package aula3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual foi a nota da prova?: ");
        float nota = scan.nextFloat();
        
        if (nota>=7){
            System.out.println("Aprovado");
        }else if (nota>=5 && nota<7){
            System.out.println("Recuperacao");
        }else if (nota<5){
            System.out.println("Reprovado");
        }
    }

}
