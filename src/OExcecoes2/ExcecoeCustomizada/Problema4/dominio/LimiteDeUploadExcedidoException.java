package OExcecoes2.ExcecoeCustomizada.Problema4.dominio;

public class LimiteDeUploadExcedidoException extends YoutubeException {
    public LimiteDeUploadExcedidoException() {
        super("O limite de upload foi excedido.");
    }

    public LimiteDeUploadExcedidoException(String message) {
        super(message);
    }
}
