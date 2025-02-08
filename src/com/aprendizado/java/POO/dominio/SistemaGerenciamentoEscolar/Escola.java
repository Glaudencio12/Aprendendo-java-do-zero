package com.aprendizado.java.POO.dominio.SistemaGerenciamentoEscolar;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Estudante> estudantes;
    private List<Curso> cursos;

    public Escola() {
        this.estudantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void removerEstudante(String matricula) {
        estudantes.removeIf(estudante -> estudante.getMatricula().equals(matricula));
    }

    public Estudante buscarEstudante(String matricula) {
        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula().equals(matricula)) {
                return estudante;
            }
        }
        return null;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(String codigo) {
        cursos.removeIf(curso -> curso.getCodigo().equals(codigo));
    }

    public Curso buscarCurso(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public void matricularEstudanteEmCurso(String matricula, String codigo) {
        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula().equals(matricula)) {
                for (Curso curso : cursos) {
                    if (curso.getCodigo().equals(codigo)) {
                        estudante.matriculaCurso(curso);
                        curso.adicionarEstudante(estudante);
                    }
                }
            }
        }
    }

    public void removerMatriculaEstudanteEmCurso(String matricula, String codigo) {
        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula().equals(matricula)) {
                for (Curso curso : cursos) {
                    if (curso.getCodigo().equals(codigo)) {
                       curso.removerEstudante(estudante);
                       estudante.cancelarCurso(curso);
                    }
                }
            }
        }
    }

    public void exibirTodosOsCursos() {
        for (Curso curso : cursos) {
            curso.exibirInfo();
            System.out.println();
        }
    }

    public void exibirTodosOsEstudantes() {
        for (Estudante estudante : estudantes) {
            estudante.exibirInfo();
            System.out.println();
        }
    }
}