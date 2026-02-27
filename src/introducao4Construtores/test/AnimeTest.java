package introducao4Construtores.test;

import introducao4Construtores.dominio.Anime;

import javax.swing.text.Style;
import java.util.Scanner;

public class AnimeTest {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nome do anime: ");
        String nome = scanner.nextLine();
        Anime anime = new Anime(nome);

        System.out.print("Quantidade de ep: ");
        int ep = scanner.nextInt();

        System.out.print("Quantidade de Temporadas: ");
        int temporada = scanner.nextInt();


        anime.setEpisodios(ep);
        anime.setTemporadas(temporada);

        System.out.println(anime.getNome());
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getTemporadas());


    }
}
