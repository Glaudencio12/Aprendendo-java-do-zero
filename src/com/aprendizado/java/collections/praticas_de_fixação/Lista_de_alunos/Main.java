package com.aprendizado.java.collections.praticas_de_fixação.Lista_de_alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoService service = new AlunoService();

        int opcao;
        do {
            System.out.println("\n===== MENU DE ALUNOS =====");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Visualizar alunos (ordem de inserção)");
            System.out.println("3 - Visualizar alunos ordenados por nome");
            System.out.println("4 - Visualizar alunos ordenados por nota");
            System.out.println("5 - Buscar aluno por nome");
            System.out.println("6 - Converter lista para array");
            System.out.println("7 - Converter array para lista");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do aluno: ");
                    int idade = sc.nextInt();
                    System.out.print("Nota do aluno: ");
                    double nota = sc.nextDouble();
                    service.adicionarAluno(new Aluno(nome, idade, nota));
                    System.out.println("✅ Aluno adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de alunos (inserção) ---");
                    System.out.println(service.visualizarAlunos());
                    break;

                case 3:
                    System.out.println("\n--- Lista de alunos (ordenados por nome) ---");
                    System.out.println(service.visualizarAlunosOrdenadosPorNome());
                    break;

                case 4:
                    System.out.println("\n--- Lista de alunos (ordenados por nota) ---");
                    System.out.println(service.visualizarAlunosOrdenadosPorNota());
                    break;

                case 5:
                    System.out.print("Digite o nome do aluno para buscar: ");
                    String buscaNome = sc.nextLine();
                    Aluno encontrado = service.buscarAluno(buscaNome);
                    if (encontrado != null) {
                        System.out.println("🔎 Encontrado: " + encontrado);
                    } else {
                        System.out.println("⚠️ Aluno não encontrado!");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Convertendo lista para array ---");
                    Aluno[] array = service.converterListaParaArray();
                    for (Aluno a : array) {
                        System.out.println(a);
                    }
                    break;

                case 7:
                    System.out.println("\n--- Convertendo array para lista ---");
                    System.out.println(service.converterArrayParaList());
                    break;

                case 0:
                    System.out.println("👋 Saindo do sistema...");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida, tente novamente!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

