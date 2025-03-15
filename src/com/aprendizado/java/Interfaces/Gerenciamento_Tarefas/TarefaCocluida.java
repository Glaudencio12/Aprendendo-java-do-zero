package com.aprendizado.java.Interfaces.Gerenciamento_Tarefas;

public enum TarefaCocluida {
    TRUE("Concluída"),
    FALSE("Não concluída");

    private String cocluida;

    TarefaCocluida(String concluida) {
        this.cocluida = concluida;
    }

    public String getCocluida() {
        return cocluida;
    }
}
