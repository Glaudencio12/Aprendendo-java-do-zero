package com.aprendizado.java.POO.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    public String nome;
    public int idade;
    public List<String> consultas;

    public Paciente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.consultas = new ArrayList<>();
    }

    public void adcionarConsulta(String consulta){
        consultas.add(consulta);
    }

    public void exibirHistoricoConsultas(){
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta cadastrada");
        }else{
            System.out.println("Histórico de consultas: ");
            System.out.println(consultas.toString());
        }
    }

    public void dadosPaciente(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        exibirHistoricoConsultas();
    }
}
