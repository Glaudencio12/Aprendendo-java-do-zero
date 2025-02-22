package com.aprendizado.java.POO_conceitos_gerais.dominio;

public class Moto {
    public String marca;
    public String modelo;
    public String cor;
    public int marcha;
    public int menor_marcha;
    public int maior_marcha;
    public boolean ligada;

    public Moto(String marca, String modelo, String cor, int maior_marcha, int menor_marcha){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = menor_marcha;
        this.maior_marcha = maior_marcha;
        this.menor_marcha = menor_marcha;
        this.ligada = false ;
    }

    public void ligada(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void marchaAcima(){
        if (this.marcha < this.maior_marcha) {
            this.marcha += 1;
        }else {
            System.out.println("Maior marcha possível alcançada");
        }
    }

    public void marchaAbaixo(){
       if (this.marcha > this.menor_marcha) {
            this.marcha -= 1;
       } else{
            System.out.println("Menor marcha possível alcançada");
        }
    }

    public void mostrarDados(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marcha atual: " + this.marcha);
        System.out.println("Menor marcha possivel: " + this.menor_marcha);
        System.out.println("Maior marcha possivel: " + this.maior_marcha);
        System.out.println("Está ligada? " + this.ligada);
    }

}
