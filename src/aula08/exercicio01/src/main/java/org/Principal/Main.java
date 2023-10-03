package org.Principal;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("olaaa", "alooo", "bom dia", "testando", "testado", "testonildo", "testinho");

        System.out.println("O array tem " + stringList.stream().count());
    }
}
