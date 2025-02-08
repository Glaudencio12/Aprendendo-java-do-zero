package com.aprendizado.java.POO.dominio.SistemaGerenciamentoEscolar;

public class TestSistemaGerenciamentoEscolar {
    public static void main(String[] args) {
        Escola ifma = new Escola();

        Estudante estudante1 = new Estudante("Glaudencio","20221CNTI");
        Estudante estudante2 = new Estudante("Raimundo","20231CNTI");
        Estudante estudante3 = new Estudante("Carlos","20241CNTI");

        Curso curso1 = new Curso("Técnico em informática", "03939");
        Curso curso2 = new Curso("Técnico em Segurança", "03938");
        Curso curso3 = new Curso("Técnico em Saúde", "03999");


        ifma.adicionarCurso(curso1);
        ifma.adicionarCurso(curso2);
        ifma.adicionarCurso(curso3);

        ifma.adicionarEstudante(estudante1);
        ifma.adicionarEstudante(estudante2);
        ifma.adicionarEstudante(estudante3);

        ifma.matricularEstudanteEmCurso("20221CNTI", "03939");
        ifma.matricularEstudanteEmCurso("20231CNTI", "03939");

        ifma.removerMatriculaEstudanteEmCurso("20231CNTI", "03939");
        ifma.exibirTodosOsCursos();
        ifma.exibirTodosOsEstudantes();


    }
}
