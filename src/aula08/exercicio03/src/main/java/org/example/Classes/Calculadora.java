package org.example.Classes;

import org.example.Exceptions.DivisaoPorZeroException;

public class Calculadora {

    public double soma(double number1, double number2){
        return number1 + number2;
    }

    public double subtrair(double number1, double number2){
        return number1 - number2;
    }

    public double multiplicacao(double number1, double number2){
        return number1 * number2;
    }

    public double raiz(double number1, double number2){
        return Math.pow(number1, 1.0 / number2);
    }

    public double potencia(double number1, double number2){
        return Math.pow(number1, number2);
    }

    public double divisao(double number1, double number2){
            if (number2 != 0 ){
                return number1 / number2;
            }
        throw new DivisaoPorZeroException();
    }
}
