package Tcolecoes.Exercicios.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Sua lista privada que armazena objetos do tipo Livro
    private final List<Livro> armazenarLivros = new ArrayList<>();

    public Biblioteca() {
        // Construtor vazio, a lista já inicia pronta para o uso
    }

    // 1. Método para ADICIONAR um livro no ArrayList
    public void adicionarLivro(Livro livro) {
        // O método .add() insere o objeto Livro no final da lista automaticamente
        this.armazenarLivros.add(livro);
    }

    // 2. Método para LISTAR todos os livros armazenados
    public void listarLivros() {
        // Boa prática: checar se a lista não está vazia antes de tentar ler
        if (this.armazenarLivros.isEmpty()) {
            System.out.println("A biblioteca está vazia no momento.");
            return; // Encerra o método mais cedo
        }

        System.out.println("--- Livros no Acervo ---");
        // O "for-each" lê-se: "Para cada Livro (chamado livro) dentro da lista armazenarLivros..."
        for (Livro livro : this.armazenarLivros) {
            // Usamos os getters da classe Livro para acessar os dados privados
            System.out.println("Título: " + livro.getTitulo() + " | Autor: " + livro.getAutor());
        }
    }

    // 3. Método para BUSCAR um livro pelo título (retorna true ou false)
    public boolean buscarPorTitulo(String tituloBuscado) {
        for (Livro livro : this.armazenarLivros) {
            // equalsIgnoreCase compara os textos ignorando letras maiúsculas/minúsculas
            if (livro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                return true; // Encontrou! Retorna verdadeiro e para o laço na hora
            }
        }
        return false; // Se o laço acabou e não entrou no 'if', o livro não existe
    }
}