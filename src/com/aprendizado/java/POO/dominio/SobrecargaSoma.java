package com.aprendizado.java.POO.dominio;

public class SobrecargaSoma {
    public int soma(int a, int b){
        return a + b;
    }

    public int soma(int a, int b, int c){
        int soma = soma(a,b);
        return soma + c;
    }

    public double soma(double a, double b){
        return a + b;
    }

}
