package Jmodificadorfinal.dominio;

import java.util.StringJoiner;

public class Carro {
    private String nomeCarro;
    public final double Velocidade_limite;
    public final Comprador comprador = new Comprador();


    public Carro(String nomeCarro) {
        Velocidade_limite = 220;
        this.nomeCarro = nomeCarro;
    }

    public Carro(double velocidade_limite, String nomeCarro) {
        Velocidade_limite = velocidade_limite;
        this.nomeCarro = nomeCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public double getVelocidade_limite() {
        return Velocidade_limite;
    }

    public Comprador getComprador() {
        return comprador;
    }
}
