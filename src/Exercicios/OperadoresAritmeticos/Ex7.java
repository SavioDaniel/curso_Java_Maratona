package Exercicios.OperadoresAritmeticos;
/*Considere int a = 4, int b = 6, int c = 8.
Verifique se a < b E b < c.*/

public class Ex7 {
    static void main() {
        int a = 4;
        int b = 6;
        int c = 8;

        boolean teste = a < b && b < c;
        System.out.println(teste);
    }
}
