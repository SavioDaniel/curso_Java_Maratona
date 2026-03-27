package Kenum.dominio;

import java.util.StringJoiner;

public class Cliente {


    private String nome ;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cliente.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("tipoCliente=" + tipoCliente.VALOR)
                .add("tipoPagamento=" + tipoPagamento)
                .toString();
    }
}
