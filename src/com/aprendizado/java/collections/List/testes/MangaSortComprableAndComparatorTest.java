package com.aprendizado.java.collections.List.testes;

import com.aprendizado.java.collections.List.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaSortComprableAndComparatorTest {
    public static void main(String[] args) {
        List<Manga> mangaList = new ArrayList<>(6);

        mangaList.add(new Manga(2L,"Dragon Ball Z", 20.0));
        mangaList.add(new Manga(4L,"Attack On Titan", 50.0));
        mangaList.add(new Manga(6L,"Jujutsu Kaisen", 10.0));
        mangaList.add(new Manga(1L,"Chainsawn man", 24.0));
        mangaList.add(new Manga(3L,"Demon Slayer", 22.0));
        mangaList.add(new Manga(5L,"Re:Zero", 20.0));

        System.out.println("Usando comparable");

        Collections.sort(mangaList);

        for (Manga manga : mangaList){
            System.out.println(manga);

        }

        System.out.println("Usando comparator");

        //mangaList.sort(Comparator.comparing(Manga::getNome));
        //mangaList.sort(Comparator.comparing(Manga::getId));
        mangaList.sort(Comparator.comparing(Manga::getPreco));

        for (Manga manga : mangaList){
            System.out.println(manga);
        }
    }
}
