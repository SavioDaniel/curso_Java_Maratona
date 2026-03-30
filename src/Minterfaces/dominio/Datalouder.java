package Minterfaces.dominio;

public interface Datalouder {
    void load();
    default void chekresister(){
        System.out.println("fazendo checagem de permissões");
    }
}
