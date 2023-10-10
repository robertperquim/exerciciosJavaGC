package org.example.Classes;

public class CalculaTributos extends Calculadora {

    public double calculaTributos(int periodo, double valorTotal, double jurosAnuais){

        double prestacaoSemJuros = calculaPrestacaoSemJuros(valorTotal,periodo);
        double jurosMensal = calculaJurosPorMes(valorTotal, jurosAnuais);

        double parcelaComJuros = prestacaoSemJuros + jurosMensal;

        prestacaoSemJuros = Math.round(parcelaComJuros * 100.0) / 100.0;
        return prestacaoSemJuros;
    }

    public double calculaMeses(int periodo){
        return multiplicacao(periodo,12);
    }

    public double calculaJurosPorMes(double valorTotal, double jurosAnuais){
        return multiplicacao(valorTotal, jurosAnualParaMensal(jurosAnuais));
    }

    public double jurosAnualParaMensal(double jurosAnuais){
        return divisao(divisao(jurosAnuais , 12), 100);
    }

    public double calculaPrestacaoSemJuros(double valortotal, int periodo){
        double prestacaoSemJuros = divisao(valortotal, calculaMeses(periodo));
        prestacaoSemJuros = Math.round(prestacaoSemJuros * 100.0) / 100.0;
        return prestacaoSemJuros;

    }
}
