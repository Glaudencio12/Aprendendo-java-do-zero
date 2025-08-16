package com.aprendizado.java.collections.List.testes;

import com.aprendizado.java.collections.equals_hashcode.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class ListSmatphone {
    public static void main(String[] args) {
        List<Smartphone> smartphones = new ArrayList<>();

        Smartphone smartphone1 = new Smartphone(1234, "Samsung");
        Smartphone smartphone2 = new Smartphone(1264, "Iphone");
        Smartphone smartphone3 = new Smartphone(7234, "pix");
        Smartphone smartphone4 = new Smartphone(1234, "LG");
        
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);
        smartphones.add(smartphone4);
        
        for(Smartphone smartphone : smartphones){
            String dados = smartphone.toString();
            System.out.println(dados);
        }

        System.out.println("-".repeat(30));

        System.out.println("smartphone4 = " +  smartphones.contains(smartphone4));
    }
}
