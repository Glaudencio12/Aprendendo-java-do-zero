package com.aprendizado.java.generics.testes;

import com.aprendizado.java.generics.dominio.WildCards;

import java.util.List;

public class WildCardsTest {
    static void main() {
        WildCards.qualquerLista(List.of("A", "B", "C"));
        WildCards.listasNumericas(List.of(4.5, 6.7, 6.5));
        WildCards.listas(List.of(3, 5, 6));

        System.out.println();

        WildCards.qualquerLista(List.of(3, 5, 6));
        WildCards.listasNumericas(List.of(4.5, 6.7, 6.5));
        WildCards.listas(List.of(3.6, 5.5, 6.6));
    }
}
