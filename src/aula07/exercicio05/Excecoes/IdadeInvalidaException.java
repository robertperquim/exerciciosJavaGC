package aula07.exercicio05.Excecoes;

public class IdadeInvalidaException extends RuntimeException {

    public IdadeInvalidaException(String mensagem){
        super(mensagem);
    }
}
