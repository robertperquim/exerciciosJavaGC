/*Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções,
perguntando se a pessoa é Gestante, Idosa, Deficiente ou Nenhuma das alternativas.
Se ela for Deficiente, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito."*/

package aula00.exercicio08;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int opcao;


        do {
            System.out.println("""
                1 - Gestante
                2 - Idosa
                3 - Deficiente
                4 - Nenhuma das alternativas
                Escolha uma opcao: 
                """);
            opcao = input.nextInt();
        } while (opcao < 1 || opcao > 4);

        if (opcao == 4 ) {

            System.out.println("Voce nao tem direito a fila prioritária:");

        }else{
            System.out.println("Voce tem direito a fila prioritaria");
        }


    }
}
