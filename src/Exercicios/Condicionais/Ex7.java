package Exercicios.Condicionais;
/*Considere double salario = 2800.
Aplique as regras:
Até 2000 → aumento de 10%
De 2000 até 3000 → aumento de 7%
Acima de 3000 → aumento de 5%
Imprima o novo salário.*/
public class Ex7 {
    static void main() {
        double salario = -1000;
        double teste = 0;
        if(salario > 3000){
            teste = salario * 0.05;
            System.out.println("O salario aumentou 5%, e será: " + (salario + teste));
        } else if (salario > 2000 && salario <= 3000){
            teste = salario * 0.07;
            System.out.println("O salario aumentou 7%, e será: " + (salario + teste));
        } else if (salario >= 0 && salario <= 2000) {
            teste = salario * 0.10;
            System.out.println("O salario aumentou 10%, e será: " + (salario + teste));
        } else {
            System.out.println("Valor errado");
        }
    }
}
