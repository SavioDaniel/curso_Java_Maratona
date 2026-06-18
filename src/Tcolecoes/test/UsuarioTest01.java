package Tcolecoes.test;

import Tcolecoes.dominio.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsuarioTest01 {
    static void main() {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario(4L, "Maria", "Brasil"));
        usuarios.add(new Usuario(2L, "João", "Portugal"));
        usuarios.add(new Usuario(3L, "Ana", "Espanha"));

        System.out.println("--- Antes da Ordenação ---");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        // 1. A MÁGICA: O Java vai usar o 'compareTo' que você criou lá na classe Usuario
        // para organizar os objetos pelos IDs (2, 3, 4)
        Collections.sort(usuarios);

        System.out.println("\n--- Depois da Ordenação (Por ID) ---");
        // 2. Exibindo os usuários já organizados
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }


    }
}
