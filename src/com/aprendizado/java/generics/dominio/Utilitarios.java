package com.aprendizado.java.generics.dominio;

import java.util.List;

public class Utilitarios {

    public Utilitarios() {
    }

    public static <E> E primeiroElementoList(List<E> list){
        return list.getFirst();
    }

    public static <T> void imprimirElemento(T valor){
        System.out.println(valor);
    }

    public static <T extends Comparable> T menorValor(T a, T b){
        return (a.compareTo(b) < 0) ? a : b;
    }
}
