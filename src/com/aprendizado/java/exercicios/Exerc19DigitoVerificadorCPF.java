package com.aprendizado.java.exercicios;

public class Exerc19DigitoVerificadorCPF {
    public static void main(String[] args) {
        int[] cpf1 = {0,9,1,3,4,3,4,1,3};
        int[] cpf2 = new int[10];
        int[] multiplicador1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] multiplicador2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        int resultado1, resultado2;
        int soma1 = 0, soma2 = 0;

        for (int i = 0; i < cpf1.length; i++) {
            soma1 += cpf1[i] * multiplicador1[i];
        }
        resultado1 = 11 - (soma1 % 11);
        if (resultado1 > 9) {
            resultado1 = 0;
        }
        System.out.println("Primeiro dígito verificador: " + resultado1);

        for (int i = 0; i < cpf1.length; i++) {
            cpf2[i] = cpf1[i];
        }
        cpf2[9] = resultado1;

        for (int i = 0; i < cpf2.length; i++) {
            soma2 += cpf2[i] * multiplicador2[i];
        }
        resultado2 = 11 - (soma2 % 11);
        if (resultado2 > 9) {
            resultado2 = 0;
        }
        System.out.println("Segundo dígito verificador: " + resultado2);

        System.out.println("CPF completo: ");
        for (int i = 0; i < cpf2.length; i++) {
            System.out.print(cpf2[i]);
        }
    }
}
