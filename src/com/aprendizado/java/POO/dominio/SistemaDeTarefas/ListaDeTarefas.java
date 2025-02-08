package com.aprendizado.java.POO.dominio.SistemaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private static int totalTarefasConcluidas;
    private String nome;
    private List<Tarefa> tarefas;

    static {
        totalTarefasConcluidas = 0;
        System.out.println("Sistema iniciado");
        System.out.println("-".repeat(50));
    }

    public ListaDeTarefas(String nome){
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public static void concluirTarefas(Tarefa tarefa){
        if (!tarefa.isConcluida()) {
            tarefa.setConcluida(true);
            totalTarefasConcluidas++;
            System.out.println("Tarefa concluída: " + tarefa.getDescricao());
        }
    }

    public void adicionarTarefa(Tarefa...novastarefas){
        for (Tarefa tarefa : novastarefas){
            tarefas.add(tarefa);
        }
    }

    public void exibriTarefas(){
        for (Tarefa tarefa : tarefas){
            tarefa.exibirDetalhes();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getTotalTarefasConcluidas() {
        return totalTarefasConcluidas;
    }
}
