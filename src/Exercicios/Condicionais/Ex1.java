package Exercicios.Condicionais;

public class Ex1 {
    static void main() {
        double salario = 25.000;

        if (salario >= 0 && salario < 34.000){
            System.out.println("Você sofre uma taxa de: " + (salario * (9.7/100)));
        } else if (salario >= 34.000 && salario < 68.000) {
            System.out.println("Você sofre uma taxa de: " + (salario * (37.35/100)));
        } else if (salario >= 68.000) {
            System.out.println("Você sofre uma taxa de: " + (salario * (49.50/100)));
        }else {
            System.out.println("Valor errado.");
        }
    }
}
