package Exercicios.Atividades_Poo;
import java.util.Scanner;
public class Cadastro {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[3];
        String[] dadosNomes = new String[3];
        int[] idade = new int[3];
        int[] dadosIdade = new int[3];

        for (int i = 0; i < nome.length; i++) {

            System.out.print("Digite o " + (i+1) + "° nome: ");
            nome[i] = scanner.nextLine();

            System.out.print("Qual a idade: ");
            idade[i] = scanner.nextInt();
            scanner.nextLine();

            dadosNomes[i] = nome[i];
            dadosIdade[i] = idade[i];
        }
        System.out.println("\n--- Resultado ---");
        for (int i = 0; i < nome.length; i++) {
            if (dadosIdade[i] >= 18) {
                System.out.println(dadosNomes[i] + " - " + dadosIdade[i] + " - Maior de idade");
            } else {
                System.out.println(dadosNomes[i] + " - " + dadosIdade[i] + " - Menor de idade");
            }
        }
        scanner.close();
    }
}

