package Debug.caso01.dominio;

public class Multiplicar extends Soma {
    public Multiplicar(int num1, int num2) {
        super(num1, num2);
    }

    public int multiplicar() {
        return num1 * num2;
    }

    @Override
    public String toString() {
        return super.toString().replace("Soma", "Multiplicar") + ", multiplicacao=" + multiplicar() + "}";
        
    }
}
