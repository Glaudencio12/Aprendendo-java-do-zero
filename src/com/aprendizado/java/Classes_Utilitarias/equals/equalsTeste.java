package com.aprendizado.java.Classes_Utilitarias.equals;

public class equalsTeste {
    public static void main(String[] args) {
        Smartphone celular1 = new Smartphone(1234, "Samsung");
        Smartphone celular2 = new Smartphone(1234, "Samsung");
        Smartphone celular3 = celular1;

        // Utiliza o equal sobrescrito
        System.out.println(celular1.equals(celular2));
        System.out.println(celular3.equals(celular1));
    }
}
