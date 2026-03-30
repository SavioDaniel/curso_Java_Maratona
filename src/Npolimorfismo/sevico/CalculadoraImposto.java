package Npolimorfismo.sevico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {


    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularimposto();
        System.out.println("Produto : " + produto.getNome());
        System.out.println("Valor : " + produto.getValor());
        System.out.println("Imposto a ser pago : " + imposto);
    }
}
