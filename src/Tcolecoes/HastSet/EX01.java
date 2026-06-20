package Tcolecoes.HastSet;

import java.util.HashSet;
import java.util.Set;

public class EX01 {
    static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã"); // Tentativa de adicionar um elemento duplicado
        for (String fruta: frutas){
            System.out.println(fruta);
        }
    }
}
