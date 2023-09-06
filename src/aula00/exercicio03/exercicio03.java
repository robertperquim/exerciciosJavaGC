package aula00.exercicio03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);


        System.out.println("Informe o priemiro numero: ");
        int number1 = input.nextInt();
        System.out.println("Informe o segundo numero:" );
        int number2 = input.nextInt();
        System.out.println("Informe o terceiro numero:" );
        int number3 = input.nextInt();

        int maior = number1, menor = number1;

        if (number2 > maior){
            maior = number2;
        } else if (number2 < menor) {
            menor = number2;
        }
        if (number3 > maior){
            maior = number3;
        } else if (number3 < menor) {
            menor = number3;
        }
        double media = ((double) (number1 + number2 + number3)) / 3;
        System.out.printf("\nO maior numero e %d, o menor numero e %d e a media e %.2f", maior, menor, media);

    }
}
