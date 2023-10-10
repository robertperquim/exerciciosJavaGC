package org.example;

import org.example.Classes.Calculadora;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

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
                case 1 -> System.out.println("Soma: " + calculadora.soma(num1,num2));
                case 2 -> System.out.println("Subtração: " + calculadora.subtrair(num1,num2));
                case 3 -> System.out.println("Multiplicação: " + calculadora.multiplicacao(num1 , num2));
                case 4 -> System.out.println("Divisão: " + calculadora.divisao(num1,num2));
                case 5 -> System.out.println("Radiciação: " + calculadora.raiz(num1,num2));
                case 6 -> System.out.println("Potenciação: " + calculadora.potencia(num1, num2));
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