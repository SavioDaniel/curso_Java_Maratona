package Minterfaces.dominio;

public class DataBaseLoader implements Datalouder, Remove{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void chekresister() {
        System.out.println("Permissões no banco de dados");
    }
}
