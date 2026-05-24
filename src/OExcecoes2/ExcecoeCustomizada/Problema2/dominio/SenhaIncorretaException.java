package OExcecoes2.ExcecoeCustomizada.Problema2.dominio;

public class SenhaIncorretaException extends Exception {
    public SenhaIncorretaException() {
        super("A senha fornecida é incorreta. Por favor, tente novamente.");
    }

    public SenhaIncorretaException(String message) {
        super(message);
    }
}
