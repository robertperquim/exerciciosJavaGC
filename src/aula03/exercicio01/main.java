package aula03.exercicio01;


import aula03.exercicio01.ContaBancaria;

public class main {
    public static void main(String[] args) {

        //Metodos estaao prontos fazer apenas uma interface melhor com menu...

        ContaBancaria conta01 = new ContaBancaria("NUBANK");
        ContaBancaria conta02 = new ContaBancaria("Itau");
        if (VerificaCpf.validarCpf("05270207028")) {
            Cliente Robert = new Cliente("Robert Perquim", "05270207028", "Rua maestro mendanha");
            Cliente Ana = new Cliente("Ana Paula", "05248487005", "Rua portugal");


            conta01.setTitular(Robert);
            conta02.setTitular(Ana);
            conta01.deposito(10000);
            conta02.deposito(10000);


            conta01.pix(5000, conta02);
            System.out.println(conta01.getSaldo());
            System.out.println(conta02.getSaldo());

            conta01.getHistorico();


            conta01.alterarEndereco("Rua pinto bandeira");


            conta01.getInformacoes();

            conta02.getInformacoes();

            conta02.getHistorico();
        }else {
            System.out.println("Invalido");
        }


    }




}
