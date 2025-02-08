package com.aprendizado.java.POO.dominio.SistemaComercial;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente(){
        this.nome = "Não informado";
        this.email = "Não informado";
        this.telefone = "Não informado";
    }

    public void exibirInfo(){
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Email do cliente: " + email);
        System.out.println("Telefone do cliente: " + telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
