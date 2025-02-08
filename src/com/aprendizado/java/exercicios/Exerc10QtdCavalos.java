package com.aprendizado.java.exercicios;

import java.util.Scanner;

/*
 Escreva um programa para determinar a quantidade de cavalos necessários
 para se levantar uma massa de m quilogramas a uma altura de h metros em
 t segundos. Considere cavalos = (m * h / t) / 745,6999
 */
public class Exerc10QtdCavalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m, h, t, cavalos;

        System.out.print("Valor da massa em quilogramas: ");
        m = scanner.nextDouble();

        System.out.print("Altura a ser levantada: ");
        h = scanner.nextDouble();

        System.out.print("Tempo mínimo suspensa: ");
        t = scanner.nextDouble();

        cavalos = (m * h / t) / 745.6999;

        System.out.printf("Quantidade de cavalos necessários pra levanta6r a massa: %.2f%n", cavalos);
    }
}
