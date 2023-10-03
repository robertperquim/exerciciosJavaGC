package org.aulaexemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestaCalculadoraTest {
    @Test
    @DisplayName("Testa o metodo soma")
    void Somar(){
        Calculadora calculadora = new Calculadora(1,2);

        int soma = calculadora.soma();

        Assertions.assertEquals(3, soma);
    }

    @RepeatedTest(4)
    @DisplayName("Testa soma repetidademente")
    void Somarvalor(){
        Calculadora calculadora = new Calculadora(2,2);

        int soma = calculadora.soma();

        Assertions.assertEquals(4, soma);
    }
}
