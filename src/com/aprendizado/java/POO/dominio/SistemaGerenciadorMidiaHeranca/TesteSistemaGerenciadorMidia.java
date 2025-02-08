package com.aprendizado.java.POO.dominio.SistemaGerenciadorMidiaHeranca;

public class TesteSistemaGerenciadorMidia {
    public static void main(String[] args) {
        Filme filme = new Filme("Inception", 2010, "Christopher Nolan", 148);
        Musica musica = new Musica("Bohemian Rhapsody", 1975, "Queen", 354);
        MidiaApp spotfy = new MidiaApp("Spotfy");
        spotfy.adicionarMidia(filme, musica);
        spotfy.verPlaylist();
    }
}
