package Heranca.dominio;

public class Endececo {
    private String cidade;
    private String cep;

    public Endececo(String cidade, String cep) {
        this.cidade = cidade;
        this.cep = cep;
    }



    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }
}