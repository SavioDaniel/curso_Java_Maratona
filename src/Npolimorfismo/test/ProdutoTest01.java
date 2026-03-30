package Npolimorfismo.test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.sevico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Computador computador = new Computador("Lenovo", 4500);
        Tomate tomate = new Tomate("Tomate bola", 14);
        Televisao tv = new Televisao("Sanssung", 4789);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("__________________________________");
        CalculadoraImposto.calcularImposto(tv);

    }
}
