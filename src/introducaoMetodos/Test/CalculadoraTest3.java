package introducaoMetodos.Test;

import introducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest3 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10, 2);
        System.out.println(resultado);
    }
}
