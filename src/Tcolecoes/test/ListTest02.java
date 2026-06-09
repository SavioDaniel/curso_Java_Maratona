package Tcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    static void main(String[] args) {
        List<String> hq = new ArrayList<>();
        List<String> manga = new ArrayList<>();

        hq.add("Batman");
        hq.add("Superman");
        hq.add("Mulher Maravilha");

        manga.add("Naruto");
        manga.add("One Piece");
        manga.add("Dragon Ball");

        hq.addAll(manga);

        for (String h : hq) {
            System.out.println(h);
        }
        System.out.println(manga.get(1));

        System.out.println(manga.set(1, "Bleach"));
        System.out.println(manga);
        System.out.println(hq.size());




    }
}
