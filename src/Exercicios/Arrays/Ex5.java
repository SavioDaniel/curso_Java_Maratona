package Exercicios.Arrays;

import java.util.Arrays;

//Escreva um programa em Java para ordenar um array numérico e um array de strings.
public class Ex5 {
    static void main() {
        int[] inteiro = new int[]{13,22,3,12,5,11,7};
        String[] palavra = new String[]{"Savio", "Rebeca", "Andre", "Zatlan"};

        Arrays.sort(inteiro);
        Arrays.sort(palavra);

        System.out.println(Arrays.toString(inteiro));
        System.out.println(Arrays.toString(palavra));

    }
}
