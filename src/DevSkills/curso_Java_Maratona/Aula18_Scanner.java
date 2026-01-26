package DevSkills.curso_Java_Maratona;
import java.util.Scanner;
public class Aula18_Scanner {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nome = scanner.next();
        System.out.println("O nome será " + nome);
    }
}
