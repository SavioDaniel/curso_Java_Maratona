package introducaoMetodos.Test;

import introducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest {
    static void main() {
        //criando
        Calculadora calculadora = new Calculadora();


        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculadora teste 1");

        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando calculadora teste 2");

        calculadora.multiplicaDoisNumeros(12, 4);
        System.out.println("Finalizando calculadora teste 3");

    }
}
