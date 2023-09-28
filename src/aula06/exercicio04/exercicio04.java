/*Crie um programa Java que utilize uma estrutura de dados do tipo LinkedHashMap para associar produtos a seus preços.
 Insira algumas entradas no mapa e, em
seguida, imprima a lista de produtos na ordem em que foram inseridos, exibindo o nome do produto e seu preço.*/

package aula06.exercicio04;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        LinkedHashMap<String, Double> mapaProdutos = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao !=3)

        {
            System.out.println("""
                1 - Adicionar produto
                2 - Imprimir produtos por ordem de insercao
                3 - Sair
                Escolha uma opcao:
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionaProduto(mapaProdutos, scanner);
                case 2 -> {if (verificaMapaVazio(mapaProdutos)) {imprimeProdutos(mapaProdutos);}}
                case 3 -> System.out.println("Fechando programa");
            }

        }
        scanner.close();

    }

    private static void adicionaProduto(LinkedHashMap<String, Double> mapaProdutos , Scanner scanner){
        System.out.println("Informe o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o valopr do produto: ");
        double valor = scanner.nextDouble();

        Produto newProduto = new Produto(nome, valor);
        mapaProdutos.put(newProduto.getNome(),newProduto.getValor());

        System.out.println("Novo produto adicionado no mapa");
    }


    private static void imprimeProdutos(LinkedHashMap<String, Double> mapaProdutos ){
        mapaProdutos.forEach((nome, valor) ->{System.out.println("Produt: " + nome + " Valor R$" + valor);});
    }
    private static boolean verificaMapaVazio(LinkedHashMap<String, Double> mapaProdutos ){
        if (!mapaProdutos.isEmpty()){
            return true;
        }else{
            System.out.println("Mapa vazio");
            return false;
        }
    }

}
