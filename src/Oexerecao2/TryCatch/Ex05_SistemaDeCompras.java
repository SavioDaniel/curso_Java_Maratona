package Oexerecao2.TryCatch;

public class Ex05_SistemaDeCompras {
    static void main(String[] args) {
        double limiteCartao = 600.0;
        double valorCompra = 600.0;

        try {
            cobrarCartao(valorCompra, limiteCartao);
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static void cobrarCartao(double valor, double limite) throws Exception {
        if (valor > limite){
            throw new Exception("Valor da compra excede o limite do cartão.");
        }else {
            System.out.println("Compra realizada com sucesso!");
        }
    }
}
