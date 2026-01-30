package introducaoMetodos.Test;

import introducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest5 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int[] numeros = new int[]{1,2,3,4,5,6,7,8,9};
        calculadora.somaArray(numeros);

        calculadora.somaArrayArgs(1,2,3,4,5,6,7,8,9,32,214,1);
    }
}
