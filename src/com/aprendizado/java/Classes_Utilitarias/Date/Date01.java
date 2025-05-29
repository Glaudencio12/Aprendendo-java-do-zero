package com.aprendizado.java.Classes_Utilitarias.Date;

public class Date01 {
    public static void main(String[] args) {
        java.util.Date agora = new java.util.Date(1_746_908_943_877L); // Tempo em milissegundos
        System.out.println("Hora do sistema do computador: " + agora);

        long dezSegundosDepois = System.currentTimeMillis() + 10000;
        java.util.Date futuro = new java.util.Date(dezSegundosDepois);
        System.out.println("Dez segundos depois: " + futuro);

        //Os método abaixo esta obsoletos
        System.out.println("Data atual: " + agora.getDate());
    }
}
