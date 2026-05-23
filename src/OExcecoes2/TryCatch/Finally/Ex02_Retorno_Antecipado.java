package OExcecoes2.TryCatch.Finally;

public class Ex02_Retorno_Antecipado {
    public static void main(String[] args) {
        String resultado = numerosInteiros(10, 0);
        System.out.println("Resultado do método: " + resultado);
    }
    public static String numerosInteiros (int a, int b) {
        try {
            int divisao = a / b;
            return "sucesso no calculo";
        }catch (ArithmeticException e) {
            return "Falha no cálculo: " + e.getMessage();
        } finally {
            System.out.println("O finalmente sempre roda!");
        }
    }

}
