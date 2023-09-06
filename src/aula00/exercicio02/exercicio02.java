//Crie um programa que receba 2 números e imprima na tela.

package aula00.exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o priemiro numero: ");
        int number1 = input.nextInt();
        System.out.println("Informe o segundo numero:" );
        int number2 = input.nextInt();
        System.out.println("Os numeros digitados foram:" + number2 + " e " + number1 );
    }
}
