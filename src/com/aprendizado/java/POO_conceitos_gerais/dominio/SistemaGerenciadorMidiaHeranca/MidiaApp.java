package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciadorMidiaHeranca;

import java.util.ArrayList;
import java.util.List;

public class MidiaApp {
    private String nome;
    private List<Midia> midias;

    public MidiaApp(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia... addMidia){
        for (Midia midia : addMidia){
            midias.add(midia);
        }
    }

    public void verPlaylist(){
        System.out.println("*".repeat(50));
        System.out.println("Playlist: ");
        System.out.println("*".repeat(50));
        for (Midia midia : midias){
            if (midia instanceof Filme) {
                System.out.println("Filmes: ");
            }else{
                System.out.println("Músicas: ");
            }
            midia.exibirDetalhes();
            System.out.println("=".repeat(50));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
