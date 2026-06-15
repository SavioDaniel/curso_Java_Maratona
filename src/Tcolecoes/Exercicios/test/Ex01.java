package Tcolecoes.Exercicios.test;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main() {
        List<String> cores = new ArrayList<>();

        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Rosa");

        for (String cor: cores){
            System.out.println(cor);
        }

        cores.add(0, "Preto");
        System.out.println("------------------");
        for (String cor: cores) {
            System.out.println(cor);
        }

    }
}
