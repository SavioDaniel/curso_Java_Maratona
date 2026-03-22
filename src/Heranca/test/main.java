package Heranca.test;

import Heranca.dominio.Endececo;
import Heranca.dominio.Funcionario;
import Heranca.dominio.Pessoa;

public class main {
    public static void main(String[] args) {
        Endececo endececo = new Endececo("Porto Franco", "65970-000");

        Funcionario funcionario = new Funcionario(
                "Sávio",
                "609.201.693-17",
                24,
                "Programador",
                3500.00
        );

        Pessoa pessoa = new Pessoa(
                "Rebeca",
                "472.398.203-92",
                20
        );

        funcionario.setEndececo(endececo);
        funcionario.imprime();
        System.out.println("\n-------------------");
        pessoa.imprime();

    }
}
