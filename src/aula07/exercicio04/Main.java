package aula07.exercicio04;

import aula07.exercicio03.numberNotInteger;
import aula07.exercicio04.Enum.Operacoes;
import aula07.exercicio04.Excexoes.divisaoPorZero;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        double number1 = pegaNumero(scanner);
        double number2 = pegaNumero(scanner);

        scanner.nextLine();
        try {
            System.out.println("""
                     SOMA
                     SUBTRACAO
                     DIVISAO
                     MULTIPLICACAO
                     Informe a operacao
                    """);
            String newOperacao = scanner.nextLine().toUpperCase();

            Operacoes operacao = Operacoes.valueOf(newOperacao);

            switch (operacao){
                case SOMA -> System.out.println("A soma e " + calculadora.somar(number1, number2));
                case SUBTRACAO -> System.out.println("A subtracao e " + calculadora.subtrair(number1, number2));
                case DIVISAO -> {
                    if (number2 == 0){
                        throw new divisaoPorZero("Não e possivel dividir por zero");
                    }
                    System.out.println("A divisao e " + calculadora.dividir(number1, number2));
                }
                case MULTIPLICACAO-> System.out.println("A multiplicacao e " + calculadora.multiplicar(number1, number2));

            }
        } catch (divisaoPorZero e) {
            System.err.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.err.println("Nao foi possivel achar a operacao! " + e);
        }


    }

    private static double pegaNumero(Scanner scanner){
        int numero = 0;
        try {
            System.out.println("Informe um numero");
            numero = scanner.nextInt();
            if (numero < 0){
                throw new numberNotInteger("Numero nao inteiro");
            }
        }catch (InputMismatchException e ){
            System.err.println("Voce nao informou um numero.");
            scanner.next();
            pegaNumero(scanner);
        } catch (numberNotInteger e) {
            System.err.println(e.getMessage());
            pegaNumero(scanner);
        }

        return numero;
    }
}
