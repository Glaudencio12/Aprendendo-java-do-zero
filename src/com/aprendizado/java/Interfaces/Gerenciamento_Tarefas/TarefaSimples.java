package com.aprendizado.java.Interfaces.Gerenciamento_Tarefas;

public class TarefaSimples implements Tarefa {
    private String titulo;
    private String descricao;
    private int prioridade;
    private boolean finalizada;

    public TarefaSimples(String titulo, String descricao, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.finalizada = false;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String isConcluida() {
        if (!finalizada) {
            return TarefaCocluida.FALSE.getCocluida();
        } else {
            return TarefaCocluida.TRUE.getCocluida();
        }
    }

    @Override
    public void marcaComoConcluida() {
        this.finalizada = true;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Finalizada: " + isConcluida());
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
