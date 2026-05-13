package Oexececao.exception.test;

import java.io.File;

public class mkdirs {
    static void main(String[] args) {
        existe();
    }

    private static void existe() {
        File file = new File("arquivo\\teste.txt");
        if (file.exists()) {
            System.out.println("O arquivo existe.");
        } else {
            System.out.println("O arquivo não existe. usando o método mkdirs() para criar o diretório.");
            boolean isCriando = file.mkdirs();
            System.out.println("Diretório criado com sucesso? " + isCriando);
        }
        System.out.println("Listando os arquivos do diretório pai:");
        File[] files = file.getParentFile().listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }
}
