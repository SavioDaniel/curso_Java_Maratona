package Tcolecoes.test;

import Tcolecoes.dominio.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    static void main() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 123));
        produtos.add(new Produto("Smartphone", 456));
        produtos.add(new Produto("Notebook", 123)); // Produto duplicado

        Produto produtoToCheck = new Produto("Notebook", 123);
        System.out.println("Contém produto duplicado? " + produtos.contains(produtoToCheck));

    }
}
