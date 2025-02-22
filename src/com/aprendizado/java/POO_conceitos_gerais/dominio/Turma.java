package com.aprendizado.java.POO_conceitos_gerais.dominio;

import java.util.Scanner;

public class Turma {
    public String nome;
    public Estudante[] estudantes = new Estudante[4];

    public Turma(String nome) {
        this.nome = nome;
    }

    public void adicionarEstudantes(String matricula, Estudante estudante) {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null && matricula.equals(estudantes[i].matricula)) {
                System.out.println("Já existe um estudante com essa matrícula!");
                return;
            }
        }

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudante.matricula = matricula;
                estudantes[i] = estudante;
                System.out.println("Estudante adicionado com sucesso!");
                return;
            }
        }

        System.out.println("Não há espaço para adicionar mais estudantes.");
    }

    public void obterMediaTurma() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da prova (0 a 3): ");
            int prova = scanner.nextInt();

            if (prova < 0 || prova >= 4) {
                System.out.println("Número da prova inválido!");
                return;
            }

            float soma = 0;
            float media;
            int count = 0;

            for (Estudante estudante : estudantes) {
                if (estudante != null && estudante.notas != null && prova < estudante.notas.length) {
                    soma += estudante.notas[prova];
                    count++;
                }
            }

            if (count > 0) {
                media = soma / count;
                System.out.println("Média da turma na prova de número " + prova + " = " + media);
            } else {
                System.out.println("Nenhum estudante com notas disponíveis para calcular a média.");
            }
        }
    }

    public void mostrarDados() {
        System.out.println();
        System.out.println("Número de estudantes cadastrados na turma " + this.nome + ": ");
        for (Estudante estudante : estudantes) {
            if (estudante != null) {
                System.out.println("Nome: " + estudante.nome);
                System.out.println("Matrícula: " + estudante.matricula);
                System.out.println("Média das notas: " + estudante.obterMedia());
                System.out.println("Notas: ");
                if (estudante.notas != null) {
                    for (float nota : estudante.notas) {
                        System.out.println("Nota: " + nota);
                    }
                } else {
                    System.out.println("Nenhuma nota disponível.");
                }
            }
        }
    }
}
