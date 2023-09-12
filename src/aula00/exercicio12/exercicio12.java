/*Crie um programa que converta uma quantia em dólares para outra moeda, como euros ou reais.
 Peça ao usuário para inserir a quantia em dólares e a taxa de câmbio atual. Em seguida, calcule e exiba o valor convertido.*/

package aula00.exercicio12;

import java.util.Scanner;


public class exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;
        double dolares, cambio;

        do {
            System.out.println("""
                        1 - Converter para real:
                        2 - Converter para euro:
                        Escolha uma opcao:
                        """);

            opcao = input.nextInt();
        } while (opcao < 1 || opcao > 2);

        do {
            System.out.println("Informe quanto deseja converter:  ");
            dolares = input.nextDouble();
        } while (dolares <= 0);


        do {
            System.out.println("Informe o cambio do momento:  ");
            cambio = input.nextDouble();
        } while (cambio <= 0);


        if(opcao == 1){
            System.out.printf("\n $%.2f para R$ fica R$%.2f", dolares, (dolares * cambio));
        }else{
            System.out.printf("\n $%.2f para € fica €%.2f", dolares, (dolares * cambio));
        }








    }
}
