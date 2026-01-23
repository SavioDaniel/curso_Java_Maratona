package Exercicios.EstruturaDeRepetição;
/*Usando while, calcule a soma dos números de 1 a 5 e imprima o resultado final.*/
public class Ex6 {
    static void main() {
        int i = 1;
        int soma = 0;

        while ( i <= 5){
            soma += i;
            i++;
        }
        System.out.println("A soma dos números de 1 a 5 é: " + soma);

    }
}
