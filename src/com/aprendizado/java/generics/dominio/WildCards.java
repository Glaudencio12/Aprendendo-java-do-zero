package com.aprendizado.java.generics.dominio;

import java.util.List;

public class WildCards {

    public static void qualquerLista(List<?> list){
        System.out.println(list);
    }

    public static void listasNumericas(List<? extends Number> list){
        System.out.println(list);
    }

    public static void listas(List<? super Integer> list){
        System.out.println(list);
    }
}
