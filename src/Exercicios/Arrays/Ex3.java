package Exercicios.Arrays;

public class Ex3 {
    static void main() {
        int[] dados = {12, 7, 25, 4, 9};
        int maior = dados[0];

        for (int i = 1; i < dados.length; i++) {
            if (dados[i] > maior) {
                maior = dados[i];
            }
        }

        System.out.println(maior);
    }
}
