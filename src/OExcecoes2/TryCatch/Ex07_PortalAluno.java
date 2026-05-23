package OExcecoes2.TryCatch;

public class Ex07_PortalAluno {
    static void main(String[] args) {
        int opcao = 2; // Simulando a escolha do usuário

        try {
            processarNotaAluno(opcao);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void processarNotaAluno(int opcao) {
        if (opcao == 1) {
            throw new IllegalArgumentException("Nota invalida, digite apenas números");
        } else if (opcao == 2) {
            throw  new IndexOutOfBoundsException("Matéria não encontrada no historico!");
        } else {
            throw new RuntimeException("Erro inesperado no servidor do portal!");
        }
    }
}
