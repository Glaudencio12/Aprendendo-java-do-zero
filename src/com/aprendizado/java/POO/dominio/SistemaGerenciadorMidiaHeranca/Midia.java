package com.aprendizado.java.POO.dominio.SistemaGerenciadorMidiaHeranca;

public class Midia {
    private String titulo;
    private int anoLancamento;

    public Midia(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
