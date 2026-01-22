package Exercicios.OperadoresAritmeticos;
/*🧠 Questão 1
Considere:
int a = 8
int b = 3
int c = 2
Calcule a expressão:
a + b * c - a / c
*/

public class Ex8 {
    static void main() {
        int a = 8;
        int b = 3;
        int c = 2;

        double mat = a + b * c - a / c;

        System.out.println(mat);

    }
}
