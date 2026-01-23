package Exercicios.EstruturaDeRepetição;
/*Usando for, imprima os números de 1 a 20, mas:

pule os múltiplos de 3*/
public class Ex8 {
    static void main() {

        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
