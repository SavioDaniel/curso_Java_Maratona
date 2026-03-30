package Minterfaces.dominio;

public class FIleloader implements Datalouder, Remove{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }


    @Override
    public void remove() {
        System.out.println("Deletrando dados de um arquivo");
    }

    @Override
    public void chekresister() {
        System.out.println("Permissões no arquivo");
    }
}
