package aula07.exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe  um numero intero");
            int number1 = scanner.nextInt();
            if (number1 <= 0) {
                throw new numberNotInteger("Numero  1 nao inteiro!!");
            }
            System.out.println("Informe  outro numero intero");
            int number2 = scanner.nextInt();
            if (number2 <= 0) {
                throw new numberNotInteger("Numero 2 nao inteiro!!");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERRO: voce nao digitou um numero ");
        } catch (numberNotInteger e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Fim");
        }



    }
}
