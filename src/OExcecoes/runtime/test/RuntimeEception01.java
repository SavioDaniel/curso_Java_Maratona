package OExcecoes.runtime.test;

public class RuntimeEception01 {
    static void main(String[] args) {
        divisao(2, 1);
    }

    /**
     *
     * @param a
     * @param b divisor não pode ser zero, caso contrário, uma exceção será lançada.
     * @return
     * @throws IllegalArgumentException se o divisor for zero, indicando que a divisão por zero não é permitida.
     */

    private static int divisao(int a, int b){
        if (b  == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }else {
            System.out.println(a / b);
            return a / b;
        }
    }
}

