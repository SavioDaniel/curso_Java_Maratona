package Oexerecao2.TryCatch;

import java.util.Scanner;

public class Ex01 {
    static void main(String[] args) {
        teste();
    }
    private static void teste() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int divisor = scanner.nextInt();

        System.out.println("Digite um número inteiro: ");
        int dividendo = scanner.nextInt();

        try {
            int a = divisor / dividendo;
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
