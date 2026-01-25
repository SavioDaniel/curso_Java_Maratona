package Exercicios.Arrays;

public class Ex4 {
    static void main() {
        int[] numeros = {1, 4, 6, 7, 9, 10};
        int contador = 0;
        for (int arrays: numeros){
            if (arrays % 2 == 0){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
