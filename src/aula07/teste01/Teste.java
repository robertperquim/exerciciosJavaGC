package aula07.teste01;

import java.util.Scanner;
public class Teste {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int totalNotas = 0;
            double somaNotas = 0.0;

            System.out.println("Calculadora de Média de Notas");
            System.out.print("Quantas notas você deseja inserir? ");

            try {
                totalNotas = scanner.nextInt();
                if (totalNotas <= 0) {
                    throw new IllegalArgumentException("O número de notas deve ser maior que zero.");
                }

                System.out.println("Digite as notas:");

                for (int i = 0; i < totalNotas; i++) {
                    double nota = scanner.nextDouble();

                    // Verificar se a nota está no intervalo válido (0 a 10)
                    if (nota < 0 || nota > 10) {
                        throw new IllegalArgumentException("Nota fora do intervalo válido (0 a 10).");
                    }

                    somaNotas += nota;
                }

                double media = somaNotas / totalNotas;
                System.out.println("A média das notas é: " + media);
            } catch (IllegalArgumentException e) {
                System.err.println("Erro: " + e.getMessage());
            } catch (java.util.InputMismatchException e) {
                System.err.println("Erro: Entrada inválida. Certifique-se de inserir números.");
            } finally {
                scanner.close();
            }
        }

}