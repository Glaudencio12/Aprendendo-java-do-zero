package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciadorMidiaHeranca;

public class Filme extends Midia {
    private String diretor;
    private int duracaoMinutos;

    public Filme(String titulo, int anoLancamento, String diretor, int duracaoMinutos) {
        super(titulo, anoLancamento);
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
