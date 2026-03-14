package introducaoGassociacao.test;

import introducaoGassociacao.dominio.Jogador;

public class Jogadortest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Gabigol");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
