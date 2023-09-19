package aula03.exercicio01;

public class Cliente {
    private String nome;
    private String CPF;
    private String enderecoTitular;

    public Cliente(String nome, String CPF, String enderecoTitular) {
        this.nome = nome;
        this.CPF = CPF;
        this.enderecoTitular = enderecoTitular;
    }

    public String getNome() {return nome;}
    public String getCPF() {return CPF;}
    public String getEnderecoTitular() {return enderecoTitular;}
    public void setEnderecoTitular(String enderecoTitular) {this.enderecoTitular = enderecoTitular;}


}
