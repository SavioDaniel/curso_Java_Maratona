package Exercicios.EstruturaDeRepetição;
//Usando while, dado:
//int x = 1
//Dobre o valor de x enquanto ele for menor que 50.
//Ao final, imprima x.
public class Ex09 {
    static void main() {
        int num = 1;

        while (num <= 50){
            num *= 2;
        }
        System.out.println(num);
    }
}
