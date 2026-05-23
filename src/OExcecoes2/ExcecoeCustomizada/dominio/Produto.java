package OExcecoes2.ExcecoeCustomizada.dominio;

public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int qunatidade) {
        this.nome = nome;
        this.quantidade = qunatidade;
    }

    public void baixarEstoque(int quantidadeDesejada) {
        if (quantidadeDesejada > this.quantidade) {
            throw new EstoqueInsuficienteException("Não há estoque suficiente de " + this.nome +
                    ". Disponível: " + this.quantidade + ", Solicitado: " + quantidadeDesejada);
        }
        this.quantidade -= quantidadeDesejada;
        System.out.println("Baixa realizada! Novo estoque de " + this.nome + ": " + this.quantidade);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
