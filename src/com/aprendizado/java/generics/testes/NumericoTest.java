package com.aprendizado.java.generics.testes;

import com.aprendizado.java.generics.dominio.Numerico;

public class NumericoTest {
    static void main() {
        Numerico<Number> numerico = new Numerico<>();
        System.out.println(numerico.soma(2, 6));
        System.out.println(numerico.soma(2.6, 6));
        System.out.println(numerico.soma(2.7, 6.5));
    }
}
