package org.example;

/*Crie um projeto Java usando o Gradle que processe uma lista de objetos do tipo "Produto"
com os seguintes atributos: nome (String), preço (double) e quantidade (int).
 Utilizando Streams,implemente as seguintes operações:
 a) Encontre o produto mais caro na lista.
 b) Calcule o preço total de todos os produtos na lista.
 c) Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles.*/


import org.example.Classes.ListaProdutos;
import org.example.Classes.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Alho", 6.99, 15));
        produtos.add(new Produto("Pao", 2.5, 25));
        produtos.add(new Produto("Bolacha", 4.99, 13));
        produtos.add(new Produto("Frango", 14.99, 5));

        ListaProdutos listProdutos = new ListaProdutos(produtos);

        System.out.println("Produto mais caro: " + listProdutos.produtoMaisCaro());
        System.out.println("A soma total dos valores e " + listProdutos.totalValores());
        System.out.println("""
                Produtos com quantiade maior que 10:
                """ + listProdutos.produtosQuantidade());
    }
}