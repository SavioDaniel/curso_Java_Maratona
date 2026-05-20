package Oexerecao2.TryCatch;

import java.util.Scanner;

public class Ex04_ValidadorDeUsuario {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome de usuário: ");
        String username = scanner.nextLine();
        try {
            cadastrarUsuario(username);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void cadastrarUsuario(String username) throws IllegalArgumentException {
        if(username.length() < 3 ){
            throw new IllegalArgumentException("O nome deve conter pelo menos 3 caracteres.");
        } else {
            System.out.println("Usuário " + username + " cadastrado com sucesso!");
        }
    }
}
