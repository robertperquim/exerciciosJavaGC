/*Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus Celsius e, em seguida, converta
essa temperatura em graus Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.*/

package aula00.exercicio10;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double temperatura, conversao;

        System.out.println("Informe a temperatura em graus Celcius: ");
        temperatura = input.nextDouble();

        conversao = (temperatura * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit e " + conversao);


    }
}
