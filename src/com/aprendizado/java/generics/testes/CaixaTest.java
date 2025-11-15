package com.aprendizado.java.generics.testes;

import com.aprendizado.java.generics.dominio.Caixa;

public class CaixaTest {
    static void main() {
        Caixa<String> caixa1 = new Caixa<>();
        System.out.println(caixa1.retornarValor("Glaudencio"));

        Caixa<Integer> caixa2 = new Caixa<>();
        System.out.println(caixa2.retornarValor(2));

        Caixa<Double> caixa3 = new Caixa<>();
        System.out.println(caixa3.retornarValor(4.64));
    }
}
