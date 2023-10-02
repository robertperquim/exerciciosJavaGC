package aula07.exercicio06;

import aula07.exercicio06.exception.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args){

        ContaBancaria contaBancaria = new ContaBancaria(10000);
        try {
        contaBancaria.sacar(200000);
       }catch (SaldoInsuficienteException e){
            System.err.println(e.getMessage());
        }

    }
}
