package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciadorMidiaHeranca;

public class Musica extends Midia{
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, int anoLancamento, String artista, int duracaoSegundos) {
        super(titulo, anoLancamento);
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracaoSegundos + " segundos");
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }
}
