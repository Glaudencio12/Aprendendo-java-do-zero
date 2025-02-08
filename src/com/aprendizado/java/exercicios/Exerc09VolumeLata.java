package com.aprendizado.java.exercicios;

import java.util.Scanner;
/*
5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando
fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam
respectivamente o volume, o raio e a altura.
 */
public class Exerc09VolumeLata {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        double V, R, A;
        System.out.print("Digite o raio da lata: ");
        R = scanner.nextDouble();

        System.out.print("Digite a área da lata: ");
        A = scanner.nextDouble();

        V = 3.14159 * R * R * A;

        System.out.printf("O volume da lata corresponde em m³ a: %.2f%n ", V);
    }
}
