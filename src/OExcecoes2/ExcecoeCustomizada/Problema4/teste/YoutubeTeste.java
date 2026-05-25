package OExcecoes2.ExcecoeCustomizada.Problema4.teste;

import OExcecoes2.ExcecoeCustomizada.Problema4.dominio.FormatoInvalidoException;
import OExcecoes2.ExcecoeCustomizada.Problema4.dominio.GerenciadorVideo;
import OExcecoes2.ExcecoeCustomizada.Problema4.dominio.LimiteDeUploadExcedidoException;

public class YoutubeTeste {
    static void main(String[] args) {
        GerenciadorVideo gerenciador = new GerenciadorVideo();

        System.out.println("--------- TESTE 1: Formato Errado ---------");
        try {
            gerenciador.postarShort("Top 10 Melhores carros" , "9:16");
        } catch (FormatoInvalidoException e) {
            System.out.println("Erro Inesperado: " + e.getMessage());
        }
        System.out.println("--------------------\n");

        System.out.println("--------- TESTE 2: Postagens Corretas ---------");
        try {
            gerenciador.postarShort("top 5 videos virais", "9:16");
        } catch (LimiteDeUploadExcedidoException e) {
            System.out.println("Capturado erro de limite: " + e.getMessage());
        }
        System.out.println("\nFim do programa!");
    }
}
