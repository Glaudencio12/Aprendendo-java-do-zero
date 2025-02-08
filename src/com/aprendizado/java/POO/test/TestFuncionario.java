package com.aprendizado.java.POO.test;

import com.aprendizado.java.POO.dominio.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcioario = new Funcionario("Glaudencio", 18);
        funcioario.setSalarios(new double[]{2000,4000,5000});
        funcioario.imprimir();
    }
}
