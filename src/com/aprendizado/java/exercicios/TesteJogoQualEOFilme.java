package com.aprendizado.java.exercicios;

public class TesteJogoQualEOFilme {
    public static void main(String[] args) {
        Exerc21QualEOFilmeArrays filme = new Exerc21QualEOFilmeArrays();

        String[] pistas = new String[6];
        filme.lerPistas(pistas);
        System.out.println("=".repeat(30));
        filme.compararFilme(pistas, 3);
    }
}
