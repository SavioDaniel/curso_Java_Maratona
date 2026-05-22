package Oexerecao2.TryCatch.Finally;

public class Ex01_LeitorDeArquivos {
    static void main() {
        boolean arquivoExiste = false; // Simulando a existência do arquivo
        try {
            lerArquivo(arquivoExiste);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void lerArquivo(boolean arquivoExiste) {
        try {
            System.out.println("Abrindo Arquivos...");
            if (!arquivoExiste) {
                throw new RuntimeException("Arquivo não encontrado.");
            }
            System.out.println("Lendo Arquivo...");
        } catch (RuntimeException e) {
            System.out.println("Catch do método: Tratando problema de leitura.");
            throw e;
        }finally {
            System.out.println("Recursos de arquivo liberado e fechado com segurança! ");
        }
    }
}
