package introducaoGassociacao.dominio;

public class Cliente {
    private String nomeCliente;
    private Carro[] carro;

    public Cliente(String nomeCliente, Carro[] carro) {
        this.nomeCliente = nomeCliente;
        this.carro = carro;
    }

    public void imprime(){
        System.out.println("Pessoa: " + this.nomeCliente);

        for(Carro carro : carro){
            System.out.println(carro.getNomeCarro());
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }
}
