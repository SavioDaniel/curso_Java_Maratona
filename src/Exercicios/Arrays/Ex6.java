package Exercicios.Arrays;
//Escreva um programa em Java para somar os valores de um array.
public class Ex6 {
    static void main() {
        int[] valor = new int[]{23,4,6,9,12};
        int teste =0;
        for (int i: valor){
            teste += i;
        }
        System.out.println(teste);
    }
}
