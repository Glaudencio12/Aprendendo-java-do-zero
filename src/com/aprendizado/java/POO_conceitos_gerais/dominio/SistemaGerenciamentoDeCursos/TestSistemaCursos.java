package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciamentoDeCursos;

public class TestSistemaCursos {
    public static void main(String[] args) {
        PlataformaDeCursos udemy = new PlataformaDeCursos("Udemy");

        Curso curso1 = new Curso(101, "Java em 1 hora", "Aprenda Java em 1 hora, rápido e fácil", 1);
        Curso curso2 = new Curso(202, "Desenvolvimento Web Básico", "Introdução ao desenvolvimento web", 20);
        Curso curso3 = new Curso(303, "Banco de Dados SQL", "Curso completo sobre banco de dados SQL", 15);
        Curso curso4 = new Curso(404, "Introdução ao Machine Learning", "Aprenda os conceitos básicos de Machine Learning", 25);
        Curso curso5 = new Curso(05, "Python para Data Science", "Uso de Python em análise de dados e data science", 30);

        udemy.adicionarCurso(curso1, curso2, curso3, curso4, curso5);
        System.out.println("Quantidade de cursos cadastrados: " + PlataformaDeCursos.getTotalCursos());

        curso1.setDisponivel(false);

        udemy.exiriCursos();
    }
}
