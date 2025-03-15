package com.aprendizado.java.Interfaces.Gerenciamento_Tarefas;

public interface Tarefa {
    String getTitulo();

    String getDescricao();

    int getPrioridade();

    void setPrioridade(int prioridade);

    String isConcluida();

    void marcaComoConcluida();

    void exibirInformacoes();
}
