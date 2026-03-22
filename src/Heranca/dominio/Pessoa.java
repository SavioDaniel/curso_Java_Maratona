package Heranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private Endececo endececo;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);

        if (endececo != null) {
            System.out.println("Cidade: " + endececo.getCidade());
            System.out.println("CEP: " + endececo.getCep());
        }
    }

    // Getter e Setter do endereço
    public Endececo getEndececo() {
        return endececo;
    }

    public void setEndececo(Endececo endececo) {
        this.endececo = endececo;
    }

    // Outros getters e setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}