package introducaoGassociacao.dominio;

public class Carro {
    private String nomeCarro;

    public Carro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }


    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }
}
