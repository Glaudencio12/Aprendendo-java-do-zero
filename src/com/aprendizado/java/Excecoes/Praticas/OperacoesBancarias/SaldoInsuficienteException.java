package com.aprendizado.java.Excecoes.Praticas.OperacoesBancarias;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
