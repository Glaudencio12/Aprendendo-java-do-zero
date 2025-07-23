package com.aprendizado.java.Regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciciosRegex {
    public static void main(String[] args) {
        validarCeps();
        validarTelefoneSimples();
        validarCoresHexadecimais();
        validarData();
        validarEmail();
    }

    public static void validarCeps(){
        String ceps = "883500-000, 12345-678, 99999, 65620-000"; // Ceps que serão validados
        Pattern pattern = Pattern.compile("\\b[0-9]{5}-[0-9]{3}\\b"); // Compila a regex para um formato que pode ser usado para encontrar correspondências
        Matcher matcher = pattern.matcher(ceps); // Realiza as comparações entre o texto e o padrão patter compilado

        while (matcher.find()){ // Busca os ceps válidos
            System.out.println("CEP: " + matcher.group()); // Imprimi somente os ceps que são válidos
        }
    }

    public static void validarTelefoneSimples(){
        String telefones = "1234-5678, 12345678, 999-8888, 34324321";
        Pattern pattern = Pattern.compile("[1-9]{4}-?[1-9]{4}");
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

    public static void validarData(){
        String data = "A data do evento é 12/03/2024, não 1/3/24";
        Pattern pattern = Pattern.compile("\\b([0-9]{1,2})/([0-9]{1,2})/([1-9][0-9]{3})\\b");
        Matcher matcher = pattern.matcher(data);

        System.out.println("++++++++++++++++++++ DATAS VALIDADAS ++++++++++++++++++++");
        while (matcher.find()){
            System.out.println("DATA: " + matcher.group());
        }
    }

    public static void validarEmail(){
        String email = "nome@email.com, meu-email.teste@dominio.br, email-invalido, outro@dominio";
        Pattern pattern = Pattern.compile("\\b([\\w.-0-9])+@([a-z])+\\.([a-z])+\\b");
        Matcher matcher = pattern.matcher(email);

        System.out.println("++++++++++++++++++++ EMAILS VALIDADAS ++++++++++++++++++++");
        while (matcher.find()){
            System.out.println("EMAIL: " + matcher.group());
        }
    }
}
