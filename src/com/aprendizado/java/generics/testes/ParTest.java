package com.aprendizado.java.generics.testes;

import com.aprendizado.java.generics.dominio.Par;

public class ParTest {
    static void main() {
        Par<String, String> par1 = new Par<>("Dev", "Glaudencio");
        System.out.println(par1.getChave() + " : " + par1.getValor());

        Par<String, Integer> par2 = new Par<>("Glaudencio", 19);
        System.out.println(par2.getChave() + " : " + par2.getValor());

        Par<String, Double> par3 = new Par<>("Café", 12.4);
        System.out.println(par3.getChave() + " : " + par3.getValor());

        Par<Integer, String> par4 = new Par<>(1, "Glaudencio");
        System.out.println(par4.getChave() + " : " + par4.getValor());
    }
}
