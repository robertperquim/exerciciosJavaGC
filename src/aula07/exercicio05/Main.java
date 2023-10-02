package aula07.exercicio05;

import aula07.exercicio05.Excecoes.IdadeInvalidaException;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Informe sua idade");
            int idade = scanner.nextInt();
            if (idade <=0 || idade >= 150){
                throw new IdadeInvalidaException("Idade invalida! Por favor informe uma idade valida");
            }
        }catch (IdadeInvalidaException e){
            System.err.println("Erro" + e.getMessage());
        }catch (InputMismatchException e ){
            System.err.println("Informe apenas numeros inteiros: " + e);
        }finally {
            scanner.close();
        }
    }
}
