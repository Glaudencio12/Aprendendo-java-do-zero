package com.aprendizado.java.POO_conceitos_gerais.test;

import com.aprendizado.java.POO_conceitos_gerais.dominio.Estudante;

public class TestEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Glaudencio");
        estudante.mostrarDadosEstudante();
        System.out.println();
        estudante.adicionarNotas();
        System.out.println();
        System.out.println("Média dass 4 notas: " + estudante.obterMedia());
    }
}
