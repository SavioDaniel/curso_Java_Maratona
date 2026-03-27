package Lclassesabstratas.test;

import Lclassesabstratas.dominio.Desenvolvedor;
import Lclassesabstratas.dominio.Funcionario;
import Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest {
    static void main(String[] args) {
        Gerente gerente1 = new Gerente("Nami", 7000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Naruto", 12000);

        gerente1.imprime();
        System.out.println(gerente1);
        desenvolvedor1.imprime();
        System.out.println(desenvolvedor1);
    }
}
