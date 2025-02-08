package com.aprendizado.java.POO.dominio.SistemaGerenciamentoDeCursos;

public class Curso {
    private int codigo;
    private String titulo;
    private String descricao;
    private int duracaoHoras;
    private boolean disponivel;

    public Curso(int codigo, String titulo, String descricao, int duracaoHoras){
        this.codigo = codigo;
        this.descricao = descricao;
        this.titulo = titulo;
        this.disponivel = true;
        this.duracaoHoras = duracaoHoras;
    }

    public void exibirDetlhes(){
        System.out.println("-".repeat(50));
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Código: " + codigo);
        System.out.println("Duração em horas: " + duracaoHoras);
        System.out.println("Disponível: " + (isDisponivel() ? "Sim" :  "Não"));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }
}
