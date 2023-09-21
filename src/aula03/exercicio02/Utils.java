package aula03.exercicio02;

import java.util.List;
import java.util.Scanner;

public class Utils {
    public static int inputIndice(List<Circulo> circulos){
        Scanner input = new Scanner(System.in);
        int indice;
        do {
            System.out.println("Informe o indice do circulo que voce deseja de 0 a " + (circulos.size() - 1));
            indice = input.nextInt();
        }while (indice < 0 || indice >= circulos.size());

        return indice;
    }
}
