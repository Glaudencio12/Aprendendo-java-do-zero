package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciamentoDeCursos;

import java.util.ArrayList;
import java.util.List;

public class PlataformaDeCursos {
    private static int totalCursos;
    private String nome;
    private List<Curso> cursos;

    static {
        totalCursos = 0;
        System.out.println("Sistema iniciado!");
        System.out.println("-".repeat(50));
    }

    public PlataformaDeCursos(String nome){
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso){
        totalCursos++;
    }

    public void adicionarCurso(Curso...novosCursos){
        for (Curso curso : novosCursos){
            cursos.add(curso);
            totalCursos++;
        }
    }

    public void exiriCursos(){
        for (Curso curso : cursos){
            curso.exibirDetlhes();
        }
    }

    public static int getTotalCursos() {
        return totalCursos;
    }

    public static void setTotalCursos(int totalCursos) {
        PlataformaDeCursos.totalCursos = totalCursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
