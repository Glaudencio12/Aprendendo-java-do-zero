package com.aprendizado.java.generics.testes;

import com.aprendizado.java.generics.dominio.Utilitarios;

import java.util.List;

public class UtilitariosTest {
    static void main() {
        System.out.println(Utilitarios.primeiroElementoList(List.of(1, 3, 4)));
        Utilitarios.imprimirElemento("Glaudencio");
        System.out.println(Utilitarios.menorValor("Bola", "Mesa"));

        System.out.println(Utilitarios.primeiroElementoList(List.of(5, 3, 4)));
        Utilitarios.imprimirElemento(5);
        System.out.println(Utilitarios.menorValor(33, 35));
    }
}
