package Oexerecao2.TryCatch;

public class Ex06_EfeitoDomino {
    static void main(String[] args) {
        try {
            processarPedido();
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void processarPedido() {
        System.out.println("Processando pedido...");
        conectarEstoque();
    }

    public static void conectarEstoque() {
        boolean galpaoFechado = true;
        if(galpaoFechado){
            throw new RuntimeException("O galpão de estoque está fechado. Não é possível processar o pedido.");
        }
        System.out.println("Conectando ao estoque com sucesso!");
    }

}
