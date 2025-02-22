package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaDeTarefas;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public void exibirDetalhes(){
        System.out.println("-".repeat(50));
        System.out.println("Id da tarefa: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Tarefas concluída: " + (isConcluida() ? "Sim" : "Não"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
