package com.aprendizado.java.Regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String padrao1 = "\\d+"; // Busca todos os dígitos(Números) e o maíusculo faz o oposto
        String padrao2 = "\\s"; // Busca somente espaços e o maíusculo faz o oposto
        String padrao3 = "\\w"; // Busca caracteres normais, dígitos e (_) exclui espaços
        String padrao4 = "\\W+"; // Faz o oposto do w minúsculo, não busca o que ele busca, só espaços em branco e todo o resto que não faz parte de w
        String padrao5 = "\\d{2}"; // Busca exatamente dígitos de duas casas
        String padrao6 = "[f,5,2,s]"; // Busca exatamente os valores dentro dos colchetes
        String padrao7 = "[^f,5,2,s]"; // Não busca os valores dentro dos colchetes

        String texto = "53ugd39 f@fsf8w24tb";
        Pattern patternCompile1 = Pattern.compile(padrao7);
        Matcher matcher1 = patternCompile1.matcher(texto);

        while (matcher1.find()){
            System.out.println("Índice: " + matcher1.start() + " valor: " + matcher1.group());
        }

        System.out.println("+++++++++++Usando Range+++++++++++");

        String regex = "0[Xx]([0-9a-fA-F])+(\\s|$)";
        String numHex = "0x1234 12 0x 0x 0xABCDF 0xF";
        Pattern patternCompile2 = Pattern.compile(regex);
        Matcher matcher2 = patternCompile2.matcher(numHex);

        while (matcher2.find()){
            System.out.println("Índice: " + matcher2.start() + " - Número hexadecimal: " + matcher2.group());
        }
    }
}