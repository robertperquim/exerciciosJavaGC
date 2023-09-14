package aula00.exercicio05;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int hora, minutos, segundos, segundosTotais, segundosAteMeiaNoite;

        do {
            System.out.println("Informe o valor de horas: Use de 0 a 23 ");
            hora = input.nextInt();
        } while (hora < 0 || hora > 23);

        do {
            System.out.println("Informe o valor de minutos : Use de 0 a 59 ");
            minutos = input.nextInt();
        } while (minutos < 0 || minutos > 59);

        do {
            System.out.println("Informe o valor de segundos : Use de 0 a 59 ");
            segundos = input.nextInt();
        } while (segundos < 0 || segundos > 59);

        input.close();

        segundosTotais = (hora * 3600) + (minutos * 60) + segundos;

        segundosAteMeiaNoite = (24 * 3600) - segundosTotais;

        System.out.println("Segundos desde a meia noite: " + segundosTotais);
        System.out.println("Segundos ate a meia noite: " + segundosAteMeiaNoite);


    }
}
