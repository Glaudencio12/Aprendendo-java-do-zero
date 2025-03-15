package com.aprendizado.java.Interfaces.Gerenciamento_Tarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTerefas lista = new ListaDeTerefas();

        while (true) {
            System.out.println("=".repeat(50));
            System.out.println("1 - Adicionar uma nova tarefa.");
            System.out.println("2 - Remover uma tarefa existente.");
            System.out.println("3 - Listar todas as tarefas.");
            System.out.println("4 - Marcar uma tarefa como concluída.");
            System.out.println("5 - Listar tarefas concluídas.");
            System.out.println("6 - Alterar a prioridade de uma tarefa.");
            System.out.println("7 - Listar tarefas pendentes.");
            System.out.println("8 - Sair do sistema");
            System.out.println("=".repeat(50));

            System.out.print("Escolha um opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine().strip();

                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine().strip();

                    System.out.print("Prioridade (Digite números): ");
                    int prioridade = scanner.nextInt();

                    if (titulo.isEmpty() || descricao.isEmpty()) {
                        System.out.println("Preencha todos os campos");
                    } else {
                        Tarefa tarefa = new TarefaSimples(titulo, descricao, prioridade);
                        lista.adicionarTrefa(tarefa);
                    }
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Digite o título da tarefa a ser removida: ");
                    String tituloTarefaRemover = scanner.nextLine().strip();

                    if (!tituloTarefaRemover.isEmpty()) {
                        lista.removerTarefa(tituloTarefaRemover);
                    }else{
                        System.out.println("Preencha todos os campos");
                    }
                    break;

                case 3:
                    lista.listarTarefas();
                    break;

                case 4:
                    scanner.nextLine();
                    System.out.print("Digite o título da tarefa a ser marcada como concluída: ");
                    String tituloTarefaConcluir = scanner.nextLine().strip();

                    if (!tituloTarefaConcluir.isEmpty()) {
                        lista.marcarTarefaComoConcluida(tituloTarefaConcluir);
                    }else{
                        System.out.println("Preencha todos os campos");
                    }
                    break;

                case 5:
                    lista.listarTarefasConcluidas();
                    break;

                case 6:
                    scanner.nextLine();
                    System.out.print("Digite o título da tarefa a ser alterada: ");
                    String tituloAlteracao = scanner.nextLine().strip();

                    System.out.print("Digite a nova prioridade da tarefa: ");
                    int novaPrioridade = scanner.nextInt();

                    if (!tituloAlteracao.isEmpty()) {
                        lista.alterarPrioridadeTarefa(tituloAlteracao, novaPrioridade);
                    }else{
                        System.out.println("Preencha todos os campos");
                    }
                    break;

                case 7:
                    lista.listarTarefasNaoConcluidas();
                    break;

                case 8:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida,tente novamente");
                    break;
            }
        }
    }
}
