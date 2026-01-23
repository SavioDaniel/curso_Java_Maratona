package Exercicios.EstruturaDeRepetição;
//Imprima os números pares de 0 até 1000
public class Ex1 {
    static void main() {
        for (int i = 0; i <= 1000; i += 2){
            if (i % 2 == 0){
                System.out.println("Número par: "+ i +" ");
            }else {
                System.out.println("Número ímpar: "+ i +" ");
            }
        }

        int num = 0;
        while (num <= 1000){
            if (num % 2 == 0){
                System.out.println("Número par: "+ num +" ");
                num += 2;
            }else {
                System.out.println("Número ímpar: "+ num +" ");
                num += 2;
            }
        }
    }
}
