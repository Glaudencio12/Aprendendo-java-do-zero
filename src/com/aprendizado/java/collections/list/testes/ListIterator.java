package com.aprendizado.java.collections.list.testes;

import com.aprendizado.java.collections.list.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(2L,"Dragon Ball Z", 20.0));
        mangas.add(new Manga(4L,"Attack On Titan", 50.0));
        mangas.add(new Manga(6L,"Jujutsu Kaisen", 1.0));
        mangas.add(new Manga(1L,"Chainsawn man", 4.0));
        mangas.add(new Manga(3L,"Demon Slayer", 22.0));
        mangas.add(new Manga(5L,"Re:Zero", 20.0));

        var mangaIterator = mangas.iterator();

        while (mangaIterator.hasNext()){
            if (mangaIterator.next().getPreco() < 10) {
                mangaIterator.remove();
            }
        }

        System.out.println(mangas);
    }
}
