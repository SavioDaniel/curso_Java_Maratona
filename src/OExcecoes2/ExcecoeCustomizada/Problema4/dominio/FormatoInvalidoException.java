package OExcecoes2.ExcecoeCustomizada.Problema4.dominio;

public class FormatoInvalidoException extends YoutubeException {
    public FormatoInvalidoException() {
        super("O formato do vídeo é inválido.");
    }

    public FormatoInvalidoException(String message) {
        super(message);
    }
}
