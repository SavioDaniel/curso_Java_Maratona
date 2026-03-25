package Jmodificadorfinal.test;

import Jmodificadorfinal.dominio.Carro;
import Jmodificadorfinal.dominio.Comprador;

public class CarroTeste {
    static void main(String[] args) {
        Carro carro = new Carro("Palio");
        System.out.println(carro.Velocidade_limite);
        carro.comprador.setNomeComprador("Claudio");
        System.out.println(carro.comprador);
    }
}
