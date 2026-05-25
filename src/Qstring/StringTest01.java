package Qstring;

public class StringTest01 {
    static void main() {
        // Strings são imutáveis, ou seja, não podem ser alteradas depois de criadas.
        String nome = "Sávio";
        nome.concat(" Daniel");
        System.out.println(nome);

        String s1 = "Goku";
        String s2 = "Goku";
        System.out.println(s1 == s2); // true, porque ambos apontam para o mesmo literal na pool de strings

        String s3 = new String("Goku");
        String s4 = new String("Goku");
        System.out.println(s3 == s4); // false, porque s3 e s4 são objetos diferentes na memória
        System.out.println(s3.equals(s4)); // true, porque o método equals() compara o conteúdo das strings, e ambos têm o mesmo conteúdo "Goku"
    }
}
