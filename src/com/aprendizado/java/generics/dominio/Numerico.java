package com.aprendizado.java.generics.dominio;

public class Numerico <T extends Number>{
    public Numerico() {}

    public double soma(T a, T b){
        return  a.doubleValue() + b.doubleValue();
    }
}
