package OExcecoes.exception.test;

import java.io.File;

public class delete {
    public static void main(String[] args) {
        deletarArquivo();
    }
    private static void deletarArquivo(){
        File file = new File("arquivo\\teste.txt");
        if (file.exists()) {
            boolean isDeletado = file.delete();
            System.out.println("Arquivo deletado com sucesso? " + isDeletado);
        } else {
            System.out.println("O arquivo não existe, então não pode ser deletado.");
        }
    }
}