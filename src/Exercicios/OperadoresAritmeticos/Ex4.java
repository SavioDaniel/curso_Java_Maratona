package Exercicios.OperadoresAritmeticos;
/*Considere int idade = 16.
Verifique se a idade é menor que 18 OU maior ou igual a 65.*/
public class Ex4 {
    static void main() {
        int idade = 16;

        boolean teste = idade < 18 || idade >= 65;
        System.out.println(teste);
    }
}
