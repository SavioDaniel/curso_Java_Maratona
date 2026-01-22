package Exercicios.Condicionais;
/*Considere int idade = 20.

Se a idade for maior ou igual a 18, imprima "Maior de idade", senão imprima "Menor de idade".*/
public class Ex2 {
    static void main() {
        int idade = 20;

        /*if (idade >= 18){
            System.out.println("Maior de idade");
        } else if (idade < 18 && idade > 0) {
            System.out.println("menor de idade");
        } else {
            System.out.println("Essa idade esta errada");
        }*/

        System.out.println( idade >= 18 ? "Maior de idade":"Menor de idade");
    }
}
