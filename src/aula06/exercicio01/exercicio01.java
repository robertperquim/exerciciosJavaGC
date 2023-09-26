/*Crie um programa Java que utilize uma estrutura de dados do tipo
Stack para armazenar objetos da classe Livros. Implemente a classe Livro,
 com titulo e categoria, inicialize a pilha com alguns livros, imprimir os elementos da pilha,
 imprimir com base na categoria e implemente um loop para remover até que ela esteja vazia.*/


package aula06.exercicio01;


import aula05.exercicio06.Reserva;

import java.util.*;

public class exercicio01 {

    public static void main(String[] args) {

        Stack<Livro> pilhaLivros = new Stack<>();
        HashSet<String> categorias = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                1 - Adicionar Livro
                2 - Remover todos os livros da lista
                3 - Visualizar livros por categoria
                4 - Sair
                Escolha uma opcao:
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> adicionaLivro(pilhaLivros, scanner);
                case 2 -> {if(verificaListaVazia(pilhaLivros)){removerLivros(pilhaLivros);}}
                case 3 ->  {if (verificaListaVazia(pilhaLivros)){visualizarPorCategoria(pilhaLivros, categorias);}}
                case 4 -> System.out.println("Fechando programa");
            }

        }
        scanner.close();
    }

    private static void adicionaLivro(Stack<Livro> pilhaLivros, Scanner scanner){
        System.out.println("Informe o nome do livro: ");
        String nome = scanner.nextLine();
        System.out.println("Informe a categoria do livro: ");
        String categoria = scanner.nextLine();

        Livro newLivro = new Livro(nome, categoria);
        pilhaLivros.push(newLivro);
    }
    private static void removerLivros(Stack<Livro> pilhaLivros){
        System.out.println("Removendo todos os livros da pilha");
        pilhaLivros.removeAllElements();
    }
    private static void visualizarPorCategoria(Stack<Livro> pilhaLivros, HashSet<String> categorias){
        pegaCategorias(pilhaLivros, categorias);
        if (verificaListaVazia(pilhaLivros)){
            for (String categoriaAtual : categorias) {
                System.out.println("livros da categoria: " + categoriaAtual);
                for (Livro livro: pilhaLivros) {
                    if (Objects.equals(livro.getCategora(), categoriaAtual)){
                        System.out.println(livro.getNome());
                    }
                }

            }
        }

    }

    private static boolean verificaListaVazia(Stack<Livro> pilhaLivros){
        if (!pilhaLivros.isEmpty()){
            return true;
        }else{
            System.out.println("Pilha vazia");
            return false;
        }
    }

    private static void pegaCategorias(Stack<Livro> stackLivros, HashSet<String> categorias){
        for (Livro livro : stackLivros){
            categorias.add(livro.getCategora());
        }
    }
}
