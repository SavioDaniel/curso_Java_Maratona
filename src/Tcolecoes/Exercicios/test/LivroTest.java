package Tcolecoes.Exercicios.test;

import Tcolecoes.Exercicios.dominio.Biblioteca;
import Tcolecoes.Exercicios.dominio.Livro;

public class LivroTest {
    static void main(String[] args) {
        // 1. Criamos a nossa biblioteca (ela nasce com o ArrayList vazio)
        Biblioteca minhaBiblioteca = new Biblioteca();

        // 2. Criamos alguns objetos do tipo Livro
        Livro livro1 = new Livro("O Código Da Vinci", "Dan Brown");
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin");
        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien");

        // 3. Colocamos os livros dentro da biblioteca usando o método que criamos
        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);
        minhaBiblioteca.adicionarLivro(livro3);

        // 4. Testando o método de listar os livros do ArrayList
        minhaBiblioteca.listarLivros();

        System.out.println("\n-------------------------------------------");

        // 5. Testando a busca por um livro que EXISTE
        String termoBusca1 = "clean code";
        System.out.println("Pesquisando por: " + termoBusca1);
        if (minhaBiblioteca.buscarPorTitulo(termoBusca1)) {
            System.out.println("Resultado: Livro encontrado e disponível para empréstimo!");
        } else {
            System.out.println("Resultado: Infelizmente não temos esse livro.");
        }

        System.out.println("\n-------------------------------------------");

        // 6. Testando a busca por um livro que NÃO EXISTE
        String termoBusca2 = "Harry Potter";
        System.out.println("Pesquisando por: " + termoBusca2);
        if (minhaBiblioteca.buscarPorTitulo(termoBusca2)) {
            System.out.println("Resultado: Livro encontrado e disponível para empréstimo!");
        } else {
            System.out.println("Resultado: Infelizmente não temos esse livro.");
        }
    }
}
