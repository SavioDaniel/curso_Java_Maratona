package OExcecoes2.ExcecoeCustomizada.Problema3.teste;

import java.util.Scanner;

public class LoginInvalidoTeste {
    static void main(String[] args) {
        logar();
    }
    private static void logar() {
        Scanner scanner = new Scanner(System.in);
        String username = "Goku";
        String password = "ssj";
        System.out.println("Digite o nome de usuário:");
        String inputUsername = scanner.nextLine();
        System.out.println("Digite a senha:");
        String inputPassword = scanner.nextLine();
        if (!inputUsername.equals(username) || !inputPassword.equals(password)) {
            try {
                throw new OExcecoes2.ExcecoeCustomizada.Problema3.dominio.LoginInvalidoException("Login ou senha inválidos!");
            } catch (OExcecoes2.ExcecoeCustomizada.Problema3.dominio.LoginInvalidoException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Login bem-sucedido! Bem-vindo, " + username + "!");
        }
    }
}
