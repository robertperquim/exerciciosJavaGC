package aula06.exercicio01;

public class Livro {
    private String nome;

    private String categora;

    public Livro(String nome, String categora) {
        this.nome = nome;
        this.categora = categora;
    }

    public String getNome() {
        return nome;
    }

    public String getCategora() {
        return categora;
    }
}
