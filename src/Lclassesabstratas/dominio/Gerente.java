package Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public void salarioBonus() {
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Gerente" +
                "  -  nome = " + nome +
                "  -  salario = " + salario
                ;
    }
}
