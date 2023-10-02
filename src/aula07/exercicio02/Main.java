package aula07.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um dia");
        String dia = scanner.nextLine().toUpperCase();

        DiasDasSemanas newDia = DiasDasSemanas.valueOf(dia);

        verificaDia(newDia);


    }

    private static void verificaDia(DiasDasSemanas dia){
        switch (dia){
            case SEGUNDA -> System.out.println("Segunda-Feira");
            case TERCA -> System.out.println("Terca-Feira");
            case QUARTA -> System.out.println("Quarta-Feira");
            case QUINTA-> System.out.println("Quinta-Feira");
            case SEXTA -> System.out.println("Sexta-Feira");
            case SABADO -> System.out.println("Sabado");
            case DOMINGO -> System.out.println("Domingo");
            default -> System.out.println("Nenhum dia informado");
        }
    }
}
