package Exercicios.EstruturaDeRepetição;
/*Usando while, dado:
int i = 1
Some i a um acumulador enquanto:
i <= 10
e i for ímpar
Imprima o resultado final.*/
public class Ex11 {
    static void main() {
        int i = 1;
        int num = 0;
        while (i <= 10){
            if (i % 2 == 1){
                num += i;
            }
            i++;
        }
        System.out.println(num);
    }
}
