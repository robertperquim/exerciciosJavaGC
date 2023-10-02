package aula07.exercicio04;

import aula07.exercicio04.Interface.Calculavel;

public class Calculadora implements Calculavel {
    @Override
    public double somar(Double number1, Double number2) {
        return number1 + number2;
    }

    @Override
    public double subtrair(Double number1, Double number2) {
        return number1 - number2;
    }

    @Override
    public double dividir(Double number1, Double number2) {
        return number1 / number2;
    }

    @Override
    public double multiplicar(Double number1, Double number2) {
        return number1 * number2;
    }
}
