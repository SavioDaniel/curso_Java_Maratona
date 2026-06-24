package Tcolecoes.Equals.teste;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        //nomes 1
        nomes.add("Maria");
        nomes.add("Alex");
        nomes.add("Bob");
        nomes.add("Maria");

        //nomes 2
        nomes2.add("Maria");
        nomes2.add("Sávio");
        nomes2.add("Rebeca");
        nomes2.add("Alex");

        System.out.println(nomes.equals(nomes2));
    }
}
