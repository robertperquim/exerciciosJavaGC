/*Crie um programa em Java que peça ao usuário para inserir
seu ano de nascimento e, em seguida, calcule e exiba a idade*/
package aula00.exercicio09;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int anoNascimento, anoReferencia = 2023;


        do {

            System.out.println("Informe seu ano de nascimento: ");
            anoNascimento = input.nextInt();
        } while (anoNascimento > anoReferencia);

        input.close();

        System.out.println("Voce tem " + (anoReferencia - anoNascimento) + " anos!");




    }
}
