package Isobrescrita.dominio;

import java.util.StringJoiner;

public class Anime {
    private String nomeAnime;

    public Anime(String nomeAnime) {
        this.nomeAnime = nomeAnime;
    }

    public String getNomeAnime() {
        return nomeAnime;
    }

    public void setNomeAnime(String nomeAnime) {
        this.nomeAnime = nomeAnime;
    }

    @Override
    public String toString() {
        return "Anime\n"+ "Nome = " + nomeAnime ;
    }
}
