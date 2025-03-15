package com.aprendizado.java.Interfaces.Gerenciamento_Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTerefas {
    private List<Tarefa> listaTarefas;

    public ListaDeTerefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTrefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
        System.out.println("Tarefa adicionada à lista com sucesso");
    }

    public void removerTarefa(String titulo) {
        if (listaTarefas.removeIf(tarefa -> titulo.equals(tarefa.getTitulo()))) {
            System.out.println("Tarefa removida da lista com sucesso");
        } else {
            System.out.println("Tarefa não encontrada na lista");
        }
    }

    public void alterarPrioridadeTarefa(String titulo, int prioridade) {
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                tarefa.setPrioridade(prioridade);
            }
        }
        System.out.println("Tarefa não encontrada na lista");
    }

    public void marcarTarefaComoConcluida(String titulo) {
        for (Tarefa tarefa : listaTarefas) {
            if (titulo.equals(tarefa.getTitulo())) {
                tarefa.marcaComoConcluida();
            }
        }
        System.out.println("Tarefa não encontrada na lista");
    }

    public void listarTarefasConcluidas() {
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.isConcluida().equals(TarefaCocluida.TRUE.getCocluida())) {
                System.out.println("-".repeat(40));
                tarefa.exibirInformacoes();
            }
        }
        System.out.println("Nenhuma tarefa concluída até o momento");
    }

    public void listarTarefasNaoConcluidas() {
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.isConcluida().equals(TarefaCocluida.FALSE.getCocluida())) {
                System.out.println("-".repeat(40));
                tarefa.exibirInformacoes();
            }
        }
        System.out.println("Todas as tarefa foram concluídas até o momento");
    }

    public void listarTarefas() {
        if (!listaTarefas.isEmpty()) {
            List<Tarefa> tarefas = new ArrayList<>();
            for (Tarefa tarefa : listaTarefas) {
                if (tarefa.getPrioridade() > tarefas.size()) {
                    tarefas.add(tarefa);
                } else {
                    tarefas.add(tarefa.getPrioridade() - 1, tarefa);
                }
            }
            for (Tarefa tarefa : tarefas) {
                System.out.println("-".repeat(40));
                tarefa.exibirInformacoes();
            }
        } else {
            System.out.println("Não possui nenhuma tarefa na lista");
        }
    }
}