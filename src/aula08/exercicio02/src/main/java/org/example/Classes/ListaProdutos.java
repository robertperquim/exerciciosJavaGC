package org.example.Classes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ListaProdutos {

    private final List<Produto> produtoList;

    public ListaProdutos(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public String produtoMaisCaro() {
        return produtoList.stream().max(Comparator.comparing(Produto::getValor)).get().toString();
}

    public double totalValores(){
        return produtoList.stream().mapToDouble(Produto::calculaPreco).sum();
    }

    public List<String> produtosQuantidade(){
        return produtoList.stream().filter(produto -> produto.getQuantidade() > 10)
                .map(Produto::getNomeProduto).collect(Collectors.toList());
    }


}
