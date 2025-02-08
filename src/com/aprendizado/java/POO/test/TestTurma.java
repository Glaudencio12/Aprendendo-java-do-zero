package com.aprendizado.java.POO.test;

import com.aprendizado.java.POO.dominio.Estudante;
import com.aprendizado.java.POO.dominio.Turma;

public class TestTurma {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Glaudencio");
        Estudante estudante2 = new Estudante("Glau");
        Turma turma = new Turma("3 T.I");
        turma.adicionarEstudantes("94r348", estudante1);
        System.out.println();
        estudante1.adicionarNotas();
        turma.mostrarDados();
        turma.adicionarEstudantes("94r348", estudante2);
        estudante2.adicionarNotas();
        turma.obterMediaTurma();
        turma.mostrarDados();
    }
}
