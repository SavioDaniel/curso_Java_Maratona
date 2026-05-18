package Oexececao.exception.test;

import Oexececao.exception.test.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginlnvalidoExceptionTest01 extends LoginInvalidoException {
    static void main(String[] args) {
        try{
            longin();
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void longin() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String name = "admin";
        String password = "123";
        System.out.println("Digite o nome de usuário:");
        String inputName = sc.nextLine();
        System.out.println("Digite a senha:");
        String inputPassword = sc.nextLine();

        if (!inputName.equals(name) || !inputPassword.equals(password)) {
            throw new LoginInvalidoException ("Login ou senha inválidos!");
        } else {
            System.out.println("Login bem-sucedido!");
        }
    }
}
