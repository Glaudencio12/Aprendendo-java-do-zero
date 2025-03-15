package com.aprendizado.java.Interfaces.Abrigo_De_Animais;

public class Main {
    public static void main(String[] args) {
        Abrigo abrigo = new Abrigo();

        Cachorro cachorro = new Cachorro("Goliás", 12, "Pastor Alemão");
        Gato gato = new Gato("Banhudo", 3, "Gato doméstico");
        Passaro passaro = new Passaro("Lorival", 5, "Papagaio do brejo");

        abrigo.addAnimal(cachorro, gato, passaro);
        abrigo.listarAnimais();
    }
}
