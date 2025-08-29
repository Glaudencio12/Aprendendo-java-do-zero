package com.aprendizado.java.collections.list.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTarefas {
    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("-- Gerenciador de Tarefas --");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1 -> {
                    System.out.println("Digite sua tarefa: ");
                    String texto = scanner.nextLine();

                    tarefas.add(texto);
                }

                case 2 -> {
                    System.out.println("Tarefas adicionadas =>");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("índice = " + i + " - " + tarefas.get(i));
                    }
                }

                case 3 -> {
                    System.out.println("Digite o ínidice da tarea a ser removida: ");
                    int indice = scanner.nextInt();
                    tarefas.remove(indice);
                }

                case 4 -> {
                    scanner.close();
                    return;
                }
                default -> throw new IllegalStateException("Esse valor não pe permitido: " + opc);
            }
        }
    }
}
