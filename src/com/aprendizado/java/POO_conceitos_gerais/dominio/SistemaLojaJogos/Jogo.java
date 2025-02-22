package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaLojaJogos;

public class Jogo {
    private String titulo;
    private Desenvolvedor desenvolvedor;
    private static int totalDeJogos;

    static {
        totalDeJogos = 0;
    }

    public Jogo(String titulo, Desenvolvedor desenvolvedor) {
        this.titulo = titulo;
        this.desenvolvedor = desenvolvedor;
        totalDeJogos++;
    }

    public void dadosJogo(){
        System.out.println("=".repeat(50));
        System.out.println("Título: " + titulo);
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome());
        System.out.println("País do desenvolvedor: " + desenvolvedor.getPais());
    }

    public static int getTotalDeJogos() {
        return totalDeJogos;
    }

    public static void setTotalDeJogos(int totalDeJogos) {
        Jogo.totalDeJogos = totalDeJogos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }
}
