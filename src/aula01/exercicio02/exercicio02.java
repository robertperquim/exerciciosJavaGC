/*Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário.
 A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.*/

package aula01.exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade;
        double salario;

        do {
            System.out.println("Informe sua idade:");
            idade = input.nextInt();
        } while (idade <= 0 || idade >= 120);

        if (idade >= 18) {
            do {
                System.out.println("Informe seu salario:");
                salario = input.nextDouble();
            } while (salario <= 0);

            if (salario > 2000){
                System.out.println("Voce pode comprar um carro com a gente!!");
            }else{
                System.out.println("Voce nao pode comprar um carro conosco pois seu salario e abaixo do minimo permitido!");
            }
        }else{
            System.out.println("Sinto Muito! voce nao pode comprar um carro conosco sendo menor de idade");
        }

    }
}




