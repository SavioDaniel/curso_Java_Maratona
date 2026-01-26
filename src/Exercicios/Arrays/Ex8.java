package Exercicios.Arrays;
//2) Escreva um programa para ler um vetor B de 15 posições e imprimir em ordem invertida.
public class Ex8 {
    static void main() {
        int[] B = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        for (int i = B.length - 1; i >= 0; i--) {
            System.out.println(B[i]);
        }

    }
}
