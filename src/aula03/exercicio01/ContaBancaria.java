package aula03.exercicio01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ContaBancaria {

    private Cliente titular;
    private int identificadorDaconta = 0;
    private String banco;
    private double saldo = 0;
    private LocalTime horarioLocal;
    private LocalDate dataAtual;
    private ArrayList<String> historico = new ArrayList<>();

    private boolean contaAtiva = true;

    private static int proximoIdentificador = 0;

    public ContaBancaria(String banco) {
        this.identificadorDaconta = proximoIdentificador++;
        this.banco = banco;

    }

    public void setTitular(Cliente titular) {this.titular = titular;}


    public Cliente getTitular() {return titular;}

    public void setHorarioLocal() {
        this.horarioLocal = LocalTime.now();
    }

    public int getIdentificadorDaconta() {
        return identificadorDaconta;
    }

    public String getBanco() {
        return banco;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public LocalTime getHorarioLocal() {
        setHorarioLocal();
        return horarioLocal.withNano(0) ;
    }

    public void getHistorico(){
        for (String transacao : historico){
            System.out.println(transacao);
        }
    }


    public boolean saque(double valor) {
        if (valor <= this.saldo && contaAtiva) {
            this.saldo = saldo - valor;
            registrarTransacao("Saque ", valor);
            return true;
        } else {
            return false;
        }

    }

    public boolean deposito(double valor) {
        if (contaAtiva) {
            this.saldo = saldo + valor;
            registrarTransacao("Deposito ",valor);
            return true;
        }
        return false;
    }

    public boolean pix(int valor, ContaBancaria destino) {

        if (valor <= this.saldo && (validaHora()) && contaAtiva) {
            this.saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            registrarTransacao("Pix efetuado para " + destino.getTitular().getNome(), valor);
            destino.registrarTransacao("Pix recebido de " + getTitular().getNome(), valor);
            return true;

        } else {
            return false;
        }
    }

    public boolean transferencia(ContaBancaria destino, double valor){

        if (valor <= this.saldo && (validaHora()) && contaAtiva) {
            this.saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            registrarTransacao("Transferencia efetuada para " + destino.titular.getNome(), valor);
            destino.registrarTransacao("Tranferencia recebida de " + titular.getNome(), valor);
            return true;
        } else {
            return false;
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
        System.out.println("Nome: " + titular.getNome());
        System.out.println("Endereço: " + titular.getEnderecoTitular());
        System.out.println("Indentificador da conta: " + getIdentificadorDaconta());
        System.out.println("Banco: " + getBanco());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Horario: " + getHorarioLocal());
    }

    public void registrarTransacao(String descricao, double valor){

        historico.add(descricao + " | Valor: " + valor);

    }

    public void alterarEndereco(String novoEndereco){ titular.setEnderecoTitular(novoEndereco);}

    public void taxadeManutencao(){ //ver com o sor como fazer para o metodo ser chamado automaticamente!
        dataAtual = LocalDate.now();
        if (dataAtual.getDayOfMonth() == 1){
            this.saldo = saldo - 10;
        }
    }
    public void jurosSobreoSaldo(){ //ver com o sor como fazer para o metodo ser chamado automaticamente!
        dataAtual = LocalDate.now();
        if (dataAtual.getDayOfMonth() == 1){
            this.saldo = saldo + (saldo * 0.0008);
        }
    }

    public void encerrarConta(){
        contaAtiva = false;
        saldo = 0;
    }

}




