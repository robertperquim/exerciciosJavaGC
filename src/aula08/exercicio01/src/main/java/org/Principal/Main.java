package org.Principal;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("olaaa",
                "olaaa",
                "alooo",
                "bom dia",
                "testando",
                "testado",
                "testonildo",
                "testinho",
                "testonildo",
                "testonildo",
                "testando",
                "testando",
                "testando",
                "testando");

        System.out.println("O array tem " + stringList.stream().count());

        String stringMaisLonga = stringList.stream().max(Comparator.comparing(String:: length)).get(); // comparo os tamanhos das strings e retorno a maior

        System.out.println("A string mais longa é " + stringMaisLonga);


        Map<String, Long> quantidadeVezesString = stringList.stream()
                .collect(Collectors.groupingBy(string -> string, Collectors.counting())); //conto a quantidade que cada string apareceu e guardo em um mapa de chave valor

        List<Map.Entry<String, Long>> cincoMaisFrequentes = quantidadeVezesString.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5).collect(Collectors.toList()); // ordeno de forma decrescente pelo valor que é o numero de vezes que a string aparecer pego as 5 priemeiras e coloco em uma lista




        System.out.println("AS 5 mais frequentes:  " + cincoMaisFrequentes);
    }
}
