package OExcecoes2.ExcecoeCustomizada.Problema3.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super ("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
