package introducaoGassociacao.test;

import introducaoGassociacao.dominio.Carro;
import introducaoGassociacao.dominio.Cliente;

public class CarroTest {
    static void main(String[] args) {

        Carro carro1 = new Carro("Fusca");
        Carro carro2 = new Carro("Palio");
        Carro carro3 = new Carro("Ferrari");
        Carro[] carros = {carro1, carro2, carro3};
        Cliente cliente = new Cliente("Savio", carros);

        cliente.imprime();

    }
}
