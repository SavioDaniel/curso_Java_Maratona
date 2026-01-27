package javacore.introducaoclasses.Test;

import javacore.introducaoclasses.dominio.Carro;
import javacore.introducaoclasses.dominio.Cliente;

public class CarroTest01 {
    static void main() {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Cliente cliente = new Cliente();

        carro.ano = 1999;
        carro.cor = "Amarelo";
        carro.custo = 45000;
        carro.modelo = "Fiat Argo";

        carro2.ano = 1999;
        carro2.cor = "Vermelho";
        carro2.custo = 45000;
        carro2.modelo = "Fiat Argo";

        cliente.idade = 45;
        cliente.nome = "Sávio";
        cliente.sexo = "Masculino";

        System.out.println("Nome: " + cliente.nome + " Idade: " + cliente.idade + " Sexo: " + cliente.sexo);
        System.out.println("-----------------------------------");
        System.out.println(carro.ano);
        System.out.println(carro.cor);
        System.out.println(carro.custo);
        System.out.println(carro.modelo);
        System.out.println("-----------------------------------");
        System.out.println(carro2.ano);
        System.out.println(carro2.cor);
        System.out.println(carro2.custo);
        System.out.println(carro2.modelo);


    }
}
