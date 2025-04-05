package com.aprendizado.java.Excecoes.Praticas.OperacoesBancarias;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException(String message) {
        super(message);
    }
}
