/*Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
Se for menor de 16 anos, avisar que não pode votar;
Se tiver 16 ou 17, avisar que o voto é facultativo;
Se tiver mais de 65, avisar que também é facultativo o voto;
De 18 até 65, é obrigatório votar.*/

package aula00.exercicio06;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int idade;

        do {
            System.out.println("Informe sua idade:");
            idade = input.nextInt();
        } while (idade <= 0 || idade >= 120);

        if (idade < 16) {
            System.out.println("Voce nao pode votar!!");
        } else if (idade == 16 || idade == 17) {
            System.out.println("Seu voto e facultativo!!");
        } else if (idade > 65) {
            System.out.println("Seu voto e facultativo!!");
        }else {
            System.out.println("Seu voto e obrigatorio!!");
        }


    }

}
