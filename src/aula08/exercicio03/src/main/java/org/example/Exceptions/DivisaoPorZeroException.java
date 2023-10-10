package org.example.Exceptions;

public class DivisaoPorZeroException extends RuntimeException{
    public DivisaoPorZeroException(){
        super("Voce nao pode dividir por zero!!");
    }

}
