package Heranca.dominio;

public class Funcionario extends Pessoa {

    private String funcao;
    private double salario;

    public Funcionario(String nome, String cpf, int idade, String funcao, double salario) {
        super(nome, cpf, idade);
        this.funcao = funcao;
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println("Função: " + this.funcao);
        System.out.println("Salário: " + this.salario);
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }
}