package Exercicios.EstruturaDeRepetição;
/*Usando for, calcule o produto dos números de 1 a 5 e imprima o resultado.*/
public class Ex10 {
    static void main() {
        int teste = 1;
        for (int i = 1; i<=6; i++){
            teste *= i;
        }
        System.out.println(teste);
    }
}
