package Debug.caso01.dominio;

public abstract class Soma {
    protected int num1;
    protected int num2;

    public Soma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    @Override
    public String toString() {
        return "Soma{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
