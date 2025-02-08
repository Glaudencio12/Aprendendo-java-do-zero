package com.aprendizado.java.POO.test;

import com.aprendizado.java.POO.dominio.Moto;

public class TestMoto {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Bros", "Vermelha",5, 1);
        moto.mostrarDados();
        moto.ligada();
        System.out.println();
        moto.mostrarDados();
        moto.marchaAcima();
        moto.marchaAcima();
        moto.marchaAbaixo();
        moto.marchaAbaixo();
        System.out.println();
        moto.mostrarDados();
        moto.desligar();
        System.out.println();
        moto.mostrarDados();
    }
}
