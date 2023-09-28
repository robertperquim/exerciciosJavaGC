package aula06.exercicio03;

public class Contato implements Comparable<Contato> {

    private int ordemDeOrdenacao = 0;
    private final int id;
    private final String nome;
    private final String local;

    public void setOrdemDeOrdenacao(int ordemDeOrdenacao) {
        this.ordemDeOrdenacao = ordemDeOrdenacao;
    }

    public Contato(String nome, String local) {
        this.nome = nome;
        this.id = (int) (Math.random() * 100);
        this.local = local;
    }

    public String getNome() {
        return nome;
    }


    public String getLocal() {
        return local;
    }

    @Override
    public int compareTo(Contato o) {
        if (ordemDeOrdenacao == 0) {
            return (nome + id).compareTo(o.nome + o.id);
        } else {
            return (local + nome + id).compareTo(o.local + o.nome + o.id);
        }
    }
}
