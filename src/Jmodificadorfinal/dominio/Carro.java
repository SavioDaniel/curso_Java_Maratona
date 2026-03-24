package Jmodificadorfinal.dominio;

import java.util.StringJoiner;

public class Carro {
    private String nomeCarro;
    public final double Velocidade_limite;


    public Carro(String nomeCarro) {
        Velocidade_limite = 220;
        this.nomeCarro = nomeCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

}
