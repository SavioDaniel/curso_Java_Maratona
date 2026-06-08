package Tcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>(4);

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("José");
        nomes.add("Sará");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("------------------");
        for (int i = 0; i< nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
