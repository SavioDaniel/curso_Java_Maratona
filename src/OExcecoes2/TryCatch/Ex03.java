package OExcecoes2.TryCatch;

import java.util.Scanner;

public class Ex03 {

    // 2. O main chamou o método perigoso. Agora ELE é obrigado a usar o try-catch!
    public static void main(String[] args) {
        try {
            reproduzirVideo();
        } catch (Exception e) {
            // É AQUI que o erro jogado lá de baixo é capturado e tratado com segurança
            System.out.println("Erro capturado no main: " + e.getMessage());
        }

        System.out.println("O programa continuou vivo graças ao try-catch do main!");
    }

    // 1. Como usamos 'Exception' (Checked), o Java NOS OBRIGA a colocar o 'throws Exception' aqui!
    private static void reproduzirVideo() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            // Criando uma exceção CHECKED
            throw new Exception("Idade insuficiente para reproduzir o vídeo.");
        } else {
            System.out.println("Reproduzindo vídeo...");
        }
    }
}