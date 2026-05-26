package Qstring;

public class StringPerformaceTest {
    public static void main(String[] args) {
        // Teste com String
        long inicio = System.currentTimeMillis();
        testandoStraing(1000_000);
        long fimString = System.currentTimeMillis();
        System.out.println("Tempo gasto com String: " + (fimString - inicio) + " ms");

        // Teste com StringBuilder
        inicio = System.currentTimeMillis();
        testeStringBuilder(1000_000);
        long fimStringBuilder = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder: " + (fimStringBuilder - inicio) + " ms");

        // Teste com StringBuffer
        inicio = System.currentTimeMillis();
        testeStringBuffer(1000_000);
        long fimStringBuffer = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuffer: " + (fimStringBuffer - inicio) + " ms");
    }

    private static void testandoStraing(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void testeStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void testeStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
