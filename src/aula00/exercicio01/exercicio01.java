// Crie um programa que leia seu nome e imprima na tela.

package aula00.exercicio01;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.println("O nome digitado e : " + nome);
        input.close();
    }
}
