/*Escreva um programa que calcule o fatorial de um
número inteiro não negativo fornecido pelo usuário.
O fatorial de um número N é o produto de todos os inteiros de 1 até N.*/

package aula00.exercicio13;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, fatorial;


        do {

            System.out.println("Informe um numero inteiro positivo: ");
            numero = input.nextInt();
        } while (numero < 0);

        fatorial = numero;

        for (int i = numero - 1; i > 1 ; i--) {
            fatorial = fatorial * i;
        }


        System.out.println("O fatoriar de " + numero + " e " + fatorial );

        input.close();

    }
}
