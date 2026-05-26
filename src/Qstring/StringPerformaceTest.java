package Qstring;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        testandoStraing();
    }

    private static void testandoStraing() {
        String texto = "";
        for (int i = 0; i < 10000; i++) {
            texto += i;
        }
    }
}
