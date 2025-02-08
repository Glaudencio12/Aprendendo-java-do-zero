package com.aprendizado.java.POO.dominio;
import java.util.Scanner;

public class Estudante {
    public String nome;
    public String matricula = " ";
    public float[] notas = new float[4];

    public Estudante(String nome){
        this.nome = nome;
    }

    public void adicionarNotas(){
        for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma nota de 0 a 10 no formato float: ");
            float nota = scanner.nextFloat();

            if (nota < 0 || nota > 10) {
                System.out.println("A nota " + nota + " não existente!");
            }
            this.notas[i] = nota;
        }
    }

    public float obterMedia(){
        float soma = 0;
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        media = soma / notas.length;
        return media;
    }

    public void mostrarDadosEstudante(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
    }
}
