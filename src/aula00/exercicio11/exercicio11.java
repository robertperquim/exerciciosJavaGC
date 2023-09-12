/*Peça ao usuário que digite uma palavra ou frase e
 conte quantas vogais (a, e, i, o, u) estão presentes. Exiba o número de vogais na tela.*/

package aula00.exercicio11;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contadorVogais = 0;
        String frase;

        System.out.print("Digite uma palavra ou frase: ");

        frase = input.nextLine();


        Pattern vogais = Pattern.compile("[aeiouAEIOU]");
        Matcher procura = vogais.matcher(frase);


        while (procura.find()) {
            contadorVogais++;
        }

        System.out.println("O número de vogais na palavra ou frase é: " + contadorVogais);
    }
}