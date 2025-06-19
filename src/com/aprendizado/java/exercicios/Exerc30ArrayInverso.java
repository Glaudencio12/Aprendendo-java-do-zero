package com.aprendizado.java.exercicios;

import java.util.Arrays;

public class Exerc30ArrayInverso {
    public static void main(String[] args) {
        String[] alunos = {"Glaudencio", "Raimundo", "James", "Carlos"};
        for(int i = alunos.length - 1; i >= 0; i -- ){
            System.out.println(alunos[i]);
        }
        System.out.println("-".repeat(30));
        Arrays.stream(alunos).sorted().forEach(System.out::println);
    }
}
