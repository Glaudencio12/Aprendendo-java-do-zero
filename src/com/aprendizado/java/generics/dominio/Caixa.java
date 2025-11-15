package com.aprendizado.java.generics.dominio;

public class Caixa<T>{
    private T valor;

    public Caixa() {}

    public T retornarValor(T valor){
        this.valor = valor;
        return this.valor;
    }
}
