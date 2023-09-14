/*crie um programa que determine e escreva os
 números primos compreendidos entre um intervalo fornecido pelo usuário.*/

package aula01.exercicio01;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int intervaloMin, intervaloMax;


        do {
            System.out.println("Informe o inicio do seu intervalo: ");
            intervaloMin = input.nextInt();
        } while (intervaloMin < 2);

        do {
            System.out.println("Informe o fim do seu intervalo: ");
            intervaloMax = input.nextInt();
        } while (intervaloMax < 2 || intervaloMin > intervaloMax);

        input.close();

        System.out.println("Numeros primos dentre " + intervaloMin + " a " + intervaloMax + ":");

        for (int i = intervaloMin; i <= intervaloMax; i++) {

            boolean primo = true;

            for (int j = 2; j < i ; j++) {


                if (i % j == 0) {
                    primo = false;
                    j = i;
                }
            }

            if (primo){
                System.out.printf(" [%d] ", i);
            }
        }


    }

}
