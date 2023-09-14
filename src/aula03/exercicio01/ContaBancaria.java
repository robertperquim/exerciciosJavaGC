package aula03.exercicio01;

import java.time.LocalTime;
import java.util.ArrayList;

public class ContaBancaria {


    private String nome;
    private String cpf;
    private int identificadorDaconta;
    private String banco;
    private String enderecoDoTitular;
    private double saldo;
    private LocalTime horarioLocal;
    private ArrayList<String> historico = new ArrayList<>();

    private int idTracansacao;


    public ContaBancaria(String nome, String cpf, int identificadorDaconta, String banco, String enderecoDoTitular, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorDaconta = identificadorDaconta;
        this.banco = banco;
        this.enderecoDoTitular = enderecoDoTitular;
        this.saldo = saldo;

    }

    public void saque(double valor) {
        if (valor <= this.saldo) {
            this.saldo = saldo - valor;
            idTracansacao = 1;
        } else {
            System.out.println("Saldo não disponivel para o valor solicitado");
        }

    }

    public void deposito(double valor) {
        this.saldo = saldo + valor;
        historico.add("Deposito  no valor de " + valor );
    }

    public void pix(int valor, ContaBancaria destino) {

        if (valor <= this.saldo && (validaHora())) {
            this.saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Transacao efetuada com sucesso!!");
        } else {
            System.out.println("nao foi");
        }
    }

    public void transferencia(ContaBancaria destino, double valor){

        if (valor <= this.saldo && (validaHora())) {
            this.saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Transacao efetuada com sucesso!!");
        } else {
            System.out.println("Nao foi possivel fazer a transacao");
        }
    }

    public boolean validaHora() {

        setHorarioLocal();

        if (horarioLocal.getHour() >= 8 && horarioLocal.getHour() <= 19) {
            return true;
        } else {
            return false;
        }

    }

    public void getInformacoes(){
        System.out.println(getNome());
        System.out.println(getEnderecoDoTitular());
        System.out.println(getIdentificadorDaconta());
        System.out.println(getBanco());
        System.out.println(getSaldo());
        System.out.println(getHorarioLocal());
    }

    public double GetSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdentificadorDaconta() {
        return identificadorDaconta;
    }

    public void setIdentificadorDaconta(int identificadorDaconta) {
        this.identificadorDaconta = identificadorDaconta;
    }

    public String getEnderecoDoTitular() {
        return enderecoDoTitular;
    }

    public void setEnderecoDoTitular(String enderecoDoTitular) {
        this.enderecoDoTitular = enderecoDoTitular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;


    }

    public LocalTime getHorarioLocal() {
        setHorarioLocal();
        return horarioLocal ;
    }

    public void setHorarioLocal() {
        this.horarioLocal = LocalTime.now();
    }
}


