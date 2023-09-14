package aula01.exercicio06;

import java.util.Scanner;


public class exercicio06 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma frase:");
        String frase = input.nextLine();

        System.out.println("Frase invertida: ");

        for(int i = frase.length() - 1; i >= 0; i--) {

        System.out.print(frase.charAt(i)); // vai imprimindo caracter a caracter como se fosse no C

        }

        input.close();
    }
}
