package OExcecoes.runtime.test;

public class RuntimeEception02 {
    static void main() {
        abreConexao();
    }
    private static String abreConexao(){
        try {
            System.out.println("Abrindo conexão");
            System.out.println("Recebendo dados");
            return "Conexão aberta";
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando conexão");
        }
        return null;
    }

}
