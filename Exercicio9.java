package aula3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        
        if (idade<12){
            System.out.println("Crianca");
        }else if (idade>=12 && idade <18){
            System.out.println("Adolecente");
        }else if (idade>=18 && idade<60){
            System.out.println("Adulto");
        }else if (idade>=60){
            System.out.println("Idoso");
        }
    }

}
