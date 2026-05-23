package OExcecoes2.TryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex09_AppConfig {
    static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("config.txt"))) {
            System.out.println("Carregando configurações do sistema... ⚙️");
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println("Linha lida: " + linha);
            }
            System.out.println("⚡ Sistema inicializado com sucesso!");

        } catch (IOException e) {
            // Se o arquivo sumir ou o HD falhar, o Java cai direto aqui
            System.out.println("⚠️ Falha crítica: Não foi possível carregar as configurações do sistema!");
            System.out.println("Detalhe do erro: " + e.getMessage());
        }

    }
}
