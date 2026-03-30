package Npolimorfismo.test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 6000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularimposto());
        System.out.println("-------------------------");

        Produto produto1 = new Tomate("Francês", 23);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularimposto());
    }
}
