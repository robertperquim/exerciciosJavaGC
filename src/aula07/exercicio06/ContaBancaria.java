package aula07.exercicio06;

import aula07.exercicio06.exception.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente pra realizar o saque");
        }else{
            this.saldo-= valor;
        }
    }

}
