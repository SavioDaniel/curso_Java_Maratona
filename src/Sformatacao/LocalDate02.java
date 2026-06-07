package Sformatacao;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDate02 {
    static void main(String[] args) {
        VerificadorDeIdade();
    }

    public static void VerificadorDeIdade() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (formato: YYYY-MM-DD): ");
        String dataNascimentoStr = scanner.nextLine();

        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        LocalDate dataLimite = LocalDate.now().minusYears(13);

        if (!dataNascimento.isAfter(dataLimite)) {
            System.out.println("Cadastro liberado! Bem-vindo ao canal.");
        } else {
            System.out.println("Cadastro bloqueado. Idade mínima é 13 anos.");
        }

        scanner.close();
    }
}
