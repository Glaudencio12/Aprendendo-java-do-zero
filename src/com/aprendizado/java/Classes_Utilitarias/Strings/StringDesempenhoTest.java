package com.aprendizado.java.Classes_Utilitarias.Strings;

public class StringDesempenhoTest {
    public static void main(String[] args) {
        Long inicioString = System.currentTimeMillis();
        concatString(100000);
        Long fimString = System.currentTimeMillis();
        System.out.println("Tempo de execução da String: " + (fimString - inicioString) + "ms");

        Long inicioBuilder = System.currentTimeMillis();
        concatStringBuilder(100000);
        Long fimBuilder = System.currentTimeMillis();
        System.out.println("Tempo de execução da StringBuilder: " + (fimBuilder - inicioBuilder) + "ms");
    }

    //Medindo o desempenho da String
    public static void concatString(int tamanho){
        String text = " ";
        for (int i = 0; i < tamanho; i++) {
            text += i;
        }
    }

    //Medindo o desempenho da StringBuilder
    public static void concatStringBuilder(int tamanho){
        StringBuilder text = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            text.append(i);
        }
    }
}

