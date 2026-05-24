package OExcecoes2.ExcecoeCustomizada.Problema1.dominio;

public class EstoqueInsuficienteException extends  RuntimeException{

    public EstoqueInsuficienteException() {
        super("Estoque insuficiente para atender ao pedido.");
    }

    public EstoqueInsuficienteException(String message) {
        super(message);
    }
}
