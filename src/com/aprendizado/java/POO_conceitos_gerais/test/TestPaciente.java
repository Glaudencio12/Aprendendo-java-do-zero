package com.aprendizado.java.POO_conceitos_gerais.test;

import com.aprendizado.java.POO_conceitos_gerais.dominio.Paciente;

public class TestPaciente {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Raimundo", 34);
        paciente.adcionarConsulta("Extrair o dente ciso");
        paciente.adcionarConsulta("Fisioterapia corporal");
        paciente.dadosPaciente();
    }
}
