package Jmodificadorfinal.dominio;

import java.util.StringJoiner;

public class Comprador {
    private String nomeComprador;

    @Override
    public String toString() {
        return new StringJoiner(", ", Comprador.class.getSimpleName() + "[", "]")
                .add("nomeComprador='" + nomeComprador + "'")
                .toString();
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }
}
