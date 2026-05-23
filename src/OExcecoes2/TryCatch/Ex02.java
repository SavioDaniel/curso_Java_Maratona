package OExcecoes2.TryCatch;

import java.util.Scanner;

public class Ex02 {
    static void main() {
        reproduzirVideo();
    }

    private static void reproduzirVideo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        try {
            if (idade < 18) {
                throw  new IllegalArgumentException("Idade insuficiente para reproduzir o vídeo.");
            } else {
                System.out.println("Reproduzindo vídeo...");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
