package com.aprendizado.java.POO.test;

import com.aprendizado.java.POO.dominio.Estudante;

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
