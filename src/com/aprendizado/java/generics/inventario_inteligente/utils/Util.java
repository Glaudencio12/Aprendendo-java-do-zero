package com.aprendizado.java.generics.inventario_inteligente.utils;

import com.aprendizado.java.generics.inventario_inteligente.Model.ItemBase;

import java.util.Collection;

public class Util {
    public static <T extends Comparable<T>> T menorElemento(T a, T b){
        return (a.compareTo(b) <= 0) ? a : b;
    }

    public static void imprimirColecao(Collection<?> colecao){
        colecao.forEach(System.out::println);
    }

    public static double totalPrecos(Collection<? extends ItemBase> colecao){
        return colecao.stream().mapToDouble(ItemBase::getPreco).sum();
    }

    public static void adicionaItem(Collection<? super ItemBase> colecao, ItemBase itemBase){
        colecao.add(itemBase);
    }}
