package Exercicios.Arrays;
//1) Escreva um programa para ler um vetor A de 15 posições e imprimir seus elementos.
public class Ex7 {
    static void main() {
        int[] A = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        for (int valor: A){
            System.out.println(valor);
        }
    }
}
