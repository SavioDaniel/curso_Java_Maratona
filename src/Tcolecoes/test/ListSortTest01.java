package Tcolecoes.test;

import Tcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main() {
        List<Manga> mangas = new ArrayList<Manga>(6);

        mangas.add(new Manga(5L, "Naruto", 19.90));
        mangas.add(new Manga(1L, "One Piece", 9.90));
        mangas.add(new Manga(4L, "Dragon Ball", 29.90));
        mangas.add(new Manga(2L, "Bleach", 39.90));
        mangas.add(new Manga(3L, "Death Note", 49.90));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
