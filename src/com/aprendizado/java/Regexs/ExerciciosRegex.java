package com.aprendizado.java.Regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciciosRegex {
    public static void main(String[] args) {
        validarCeps();
        validarTelefoneSimples();
        validarCoresHexadecimais();
    }

    public static void validarCeps(){
        String ceps = "88000-000, 12345-678, 99999, 65620-000";
        Pattern pattern = Pattern.compile("[0-9]+(-)[0-9]+");
        Matcher matcher = pattern.matcher(ceps);

        System.out.println("++++++++++++++++++++ CEPS VALIDADOS ++++++++++++++++++++");
        while (matcher.find()){
            System.out.println("CEP: " + matcher.group());
        }
    }

    public static void validarTelefoneSimples(){
        String telefones = "1234-5678, 12345678, 999-8888, 34324321";
        Pattern pattern = Pattern.compile("[1-9]{4}(-)?[1-9]{4}");
        Matcher matcher = pattern.matcher(telefones);

        System.out.println("++++++++++++++++++++ TELFONES VALIDADOS ++++++++++++++++++++");
        while (matcher.find()){
            System.out.println("TELEFONE: " + matcher.group());
        }
    }

    public static void validarCoresHexadecimais(){
        String cores = "#FFC0CB, FA8, 1A3B5C, 12345G";
        Pattern pattern = Pattern.compile("\\b#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})\\b");
        Matcher matcher = pattern.matcher(cores);

        System.out.println("++++++++++++++++++++ CORES VALIDADAS ++++++++++++++++++++");
        while (matcher.find()){
            System.out.println("COR HEXADECIMAL: " + matcher.group());
        }
    }
}
