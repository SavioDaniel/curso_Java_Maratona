package OExcecoes2.ExcecoeCustomizada.Problema2.teste;

import OExcecoes2.ExcecoeCustomizada.Problema2.dominio.SenhaIncorretaException;

public class Main {
    public static void main(String[] args) {
        // 1. Criamos um usuário válido no sistema
        OExcecoes2.ExcecoeCustomizada.dominio.Usuario user = new OExcecoes2.ExcecoeCustomizada.dominio.Usuario("savio_daniel", "dev123");

        System.out.println("--- Teste 1: Tentando logar com a senha ERRADA ---");
        // O Java nos OBRIGA a usar o try-catch aqui por causa do 'throws Exception'
        try {
            user.fazerLogin("savio_daniel", "senha_qualquer"); // Vai dar erro!
            System.out.println("Essa linha não vai executar se a senha estiver errada.");
        } catch (SenhaIncorretaException e) {
            System.out.println("🛑 [CATCH CAPTUROU] -> " + e.getMessage());
        }

        System.out.println("\n--- Teste 2: Tentando logar com a senha CORRETA ---");
        try {
            user.fazerLogin("savio_daniel", "dev123"); // Vai dar certo!
        } catch (SenhaIncorretaException e) {
            System.out.println("Este catch não será executado porque a senha está certa.");
        }

        System.out.println("\nFim do sistema de segurança.");
    }

}
