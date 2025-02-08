package com.aprendizado.java.POO.test;

import com.aprendizado.java.POO.dominio.SobrecargaSoma;

public class TestSobrecargaSoma {
    public static void main(String[] args) {
        SobrecargaSoma res = new SobrecargaSoma();
        System.out.println(res.soma(1,3));
        System.out.println(res.soma(2,4,5));
        System.out.println(res.soma(2.5,3.5));
    }
}
