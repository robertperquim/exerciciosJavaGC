/*Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar.
Durante a execução o programa deve perguntar ao usuário se ele deseja continuar,
se ele não quiser, deve digitar ‘n’ para o programa encerrar.*/

package aula01.exercicio04;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int opcao;
        String continuar = "s";

        while (!continuar.equals("n")) {

            do {
                System.out.println("""
                        Calculadora!!
                        1 - Soma
                        2 - Subtracao
                        3 - Multiplicação
                        4 - Divisião
                        5 - Radiciação
                        6 - Potenciação
                        Escolha uma opcao:
                        """);
                opcao = input.nextInt();
            } while (opcao < 1 || opcao > 6);

            System.out.println("Informe o valor do primeiro numero: ");
            double num1 = input.nextDouble();
            System.out.println("Informe o valor do segundo numero: ");
            double num2 = input.nextDouble();


            switch (opcao) {
                case 1 -> System.out.println("Soma: " + (num1 + num2));
                case 2 -> System.out.println("Subtração: " + (num1 - num2));
                case 3 -> System.out.println("Multiplicação: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Voce nao pode divir por zero ");
                    }
                }
                case 5 -> System.out.println("Radiciação: " + Math.pow(num1, 1.0 / num2));
                case 6 -> System.out.println("Potenciação: " + Math.pow(num1, num2));
            }


            input.nextLine(); // Isso e para consumir o buffer do telado;;


            do {
                System.out.println("""
                        \n
                        Outra operação?
                        s -> sim
                        n -> não
                        Escolha sua opção:
                        """);
                continuar = input.nextLine().toLowerCase();
            } while (!continuar.equals("n") && !continuar.equals("s"));
        }

        input.close();
    }
}
