package Tcolecoes.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Sávio");

        for (String nome : nomes){
            System.out.println(nome);
        }

        nomes.remove(1);
        System.out.println("----");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
