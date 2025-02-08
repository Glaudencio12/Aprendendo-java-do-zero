package com.aprendizado.java.POO.dominio.SistemaDeTarefas;

import java.util.List;

public class TestSistemaDeTarefas {
    public static void main(String[] args) {
        ListaDeTarefas lista = new ListaDeTarefas("GlauGlau");

        Tarefa t1 = new Tarefa(2,"Comprar pão");
        Tarefa t2 = new Tarefa(3,"Comprar bolo");
        Tarefa t3 = new Tarefa(4,"Comprar roupa");

        lista.adicionarTarefa(t1, t2, t3);

        ListaDeTarefas.concluirTarefas(t1);
        ListaDeTarefas.concluirTarefas(t3);
        System.out.println("Quantidade de tarefas concluídas: " + ListaDeTarefas.getTotalTarefasConcluidas());

        lista.exibriTarefas();


    }
}
