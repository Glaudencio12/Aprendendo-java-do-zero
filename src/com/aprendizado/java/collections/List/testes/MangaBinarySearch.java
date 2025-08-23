package com.aprendizado.java.collections.List.testes;

import com.aprendizado.java.collections.List.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaBinarySearch {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(2L,"Dragon Ball Z", 20.0));
        mangas.add(new Manga(4L,"Attack On Titan", 50.0));
        mangas.add(new Manga(6L,"Jujutsu Kaisen", 10.0));
        mangas.add(new Manga(1L,"Chainsawn man", 24.0));
        mangas.add(new Manga(3L,"Demon Slayer", 22.0));
        mangas.add(new Manga(5L,"Re:Zero", 20.0));

        mangas.sort(Comparator.comparing(Manga::getNome));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaBuscaBinarySearch = new Manga(2L,"Dragon Ball Z", 20.0);

        //Quando se usa objetos, deve-se implementar o Comparator dentro do binarySearch
        var binarySearch = Collections.binarySearch(mangas, mangaBuscaBinarySearch, Comparator.comparing(Manga::getNome));

        System.out.println("ínidice: " + binarySearch);
    }
}
