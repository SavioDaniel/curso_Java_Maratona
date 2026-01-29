package introducaoMetodos.Test;

import introducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest4 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
