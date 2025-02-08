package com.aprendizado.java.exercicios;

public class Exerc14QuadradoInteiros15A200 {
    public static void main(String[] args) {
        for (int i = 15; i <= 200; i++) {
            int quadrado = (int) Math.pow(i,2);
            System.out.println("Quadrado de " + i + " = " + quadrado);
        }
    }
}
