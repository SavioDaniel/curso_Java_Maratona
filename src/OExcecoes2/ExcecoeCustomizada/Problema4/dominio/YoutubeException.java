package OExcecoes2.ExcecoeCustomizada.Problema4.dominio;

public class YoutubeException extends RuntimeException {
    public YoutubeException() {
        super("Ocorreu um erro relacionado ao YouTube.");
    }

    public YoutubeException(String message) {
        super(message);
    }
}
