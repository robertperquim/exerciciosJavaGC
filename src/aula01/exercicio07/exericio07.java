/*Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar.
 Leônidas pede para que seus soldados tentem adivinhar quantos inimigos irão combater.
 O usuário deve digitar seu palpite e se o número for menor do que 300.000,
 Leônidas deve dizer Um pouco mais!, caso o número dito pelo usuário seja menor, ele dirá Um pouco menos!*/

package aula01.exercicio07;

import java.util.Scanner;

public class exericio07 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numEspartanos = 300000;

        System.out.println("""
                Leônidas:
                300 iremos a uma batalha e vcs devem adivinar nbumero de espartanos que iremos enfrentar:
                """);

        int palpite = input.nextInt();

        while (palpite != numEspartanos) {

            if (palpite < numEspartanos) {
                System.out.println("""
                        Leônidas:
                        Um pouco mais!
                        """);
            } else {
                System.out.println("""
                        Leônidas:
                        Um pouco menos!
                        """);
            }

            palpite = input.nextInt();

        }

        System.out.println("""
                        Leônidas:
                        Isso aí 300!!!!!!! Vamos a batalha!!
                        """);
        input.close();
    }
}
