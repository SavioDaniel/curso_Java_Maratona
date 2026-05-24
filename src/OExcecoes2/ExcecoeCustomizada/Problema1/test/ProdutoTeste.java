package OExcecoes2.ExcecoeCustomizada.Problema1.test;

import OExcecoes2.ExcecoeCustomizada.Problema1.dominio.EstoqueInsuficienteException;
import OExcecoes2.ExcecoeCustomizada.Problema1.dominio.Produto;

public class ProdutoTeste {
    // Adicionado o 'public' aqui para o IntelliJ rodar!
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 5); // Começa com 5 unidades
        System.out.println("Produto: " + p1.getNome() + ", Estoque: " + p1.getQuantidade());

        try {
            p1.baixarEstoque(3); // 1. Baixa 3 unidades. Restam 2. (Deve funcionar!)

            System.out.println("--- Tentando forçar o erro agora ---");

            p1.baixarEstoque(4); // 2. Tenta baixar 4, mas só restam 2. (Vai estourar a exceção!)

            System.out.println("Essa linha nunca vai aparecer porque o erro corta o fluxo.");

        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro ao processar pedido: " + e.getMessage());
        }

        System.out.println("Fim do programa. O sistema continuou vivo graças ao catch!");
    }
}