package Debug.caso01.dominio;

public class Dividir extends Soma {
    public Dividir(int num1, int num2) {
        super(num1, num2);
    }

    public double dividir() {
        //if (num2 == 0) {
        //    throw new ArithmeticException("Divisão por zero não é permitida.");
        //}
        return (double) num1 / num2;
    }

    @Override
    public String toString() {
        String base = super.toString().replace("Soma", "Dividir");
        if (num2 != 0) {
            return base + ", divisao=" + dividir() + "}";
        } else {
            return base + ", divisao=indefinida (divisão por zero)}";
        }
    }
}
