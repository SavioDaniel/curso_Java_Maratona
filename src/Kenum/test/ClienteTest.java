package Kenum.test;

import Kenum.dominio.Cliente;
import Kenum.dominio.TipoPagamento;
import Kenum.dominio.TipoCliente;

public class ClienteTest {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Savio", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Rebeca", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("André", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Alcirene", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));
    }
}
