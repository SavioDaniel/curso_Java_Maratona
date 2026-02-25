package introducaoPrivate.dominio;

public class Carro {
    private String modelo;
    private int ano;
    private double valor;

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public String getModelo() {
        return modelo;
    }
}
