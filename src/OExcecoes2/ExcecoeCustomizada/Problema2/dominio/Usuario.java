package OExcecoes2.ExcecoeCustomizada.dominio;

import OExcecoes2.ExcecoeCustomizada.Problema2.dominio.SenhaIncorretaException;

public class Usuario {
    private String login;
    private String senhaCorreta;

    // Construtor para inicializar o usuário do sistema
    public Usuario(String login, String senhaCorreta) {
        this.login = login;
        this.senhaCorreta = senhaCorreta;
    }

    // O 'throws' aqui é OBRIGATÓRIO porque a exceção é Checked!
    public void fazerLogin(String loginDigitado, String senhaDigitada) throws SenhaIncorretaException {

        // Validando se o login e a senha batem com o esperado
        if (!this.login.equals(loginDigitado) || !this.senhaCorreta.equals(senhaDigitada)) {
            // Disparando a sua exceção customizada Checked
            throw new SenhaIncorretaException("Segurança: Login ou senha incorretos para o usuário: " + loginDigitado);
        }

        // Se passar pela validação, o acesso é liberado
        System.out.println("🔓 Acesso liberado! Bem-vindo de volta, " + this.login + "!");
    }

    // Getters
    public String getLogin() {
        return login;
    }
}