package introducaoStatic.dominio;

public class Sistema {

    public static String nomeSistema;
    public static int maxUsuarios;

    static {
        System.out.println("Carregando configurações do sistema...");

        nomeSistema = "Sistema Bancário";
        maxUsuarios = 1000;

        System.out.println("Configurações carregadas!");
    }
}