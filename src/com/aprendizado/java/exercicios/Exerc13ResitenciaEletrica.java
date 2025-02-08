package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc13ResitenciaEletrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a tensão elétrica(U) do circuito: ");
        double U = scanner.nextDouble();

        System.out.print("Digite a corrente elétrica(I) que passa pelo sistema: ");
        double I = scanner.nextDouble();

        double R = U / I;

        System.out.printf("A resitência do circuito eletrico corresponde a %.2f Ohms(Ω) ", R);
    }
}
