package aula00.exercicio04;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double salarioMinimo = 1320.00;

        System.out.println("Informe o seu salario: ");
        double salarioPessoa = input.nextInt();

        System.out.printf("\nVoce possui %.2f salarios minimos considerando o valor do salario minimo de %.2f", (salarioPessoa/salarioMinimo), salarioMinimo);



    }
}
