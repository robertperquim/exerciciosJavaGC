/*Escreva um programa que separa a string em duas metades e imprime a primeira parte.*/


package aula01.exercicio05;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma frase:");
        String frase = input.nextLine();


        System.out.println("Primeria metade da frase: " + frase.substring(0, (frase.length()/2)));

        input.close();
    }

}
