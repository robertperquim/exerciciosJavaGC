package aula00.exercicio01;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.println("O nome digitado e : " + nome);
    }
}
