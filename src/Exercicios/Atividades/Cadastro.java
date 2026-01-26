package Exercicios.Atividades;
import java.util.Scanner;
public class Cadastro {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] Nome = new String[3];
        int[] idade = new int[3];
        int r = 0;

        for (int i = 0; i< Nome.length; i++){
            System.out.print("Digite o "+ (i+1) +"° nome: ");
            Nome[i] = scanner.nextLine();
            System.out.print("Qual a idade: ");
            idade[i] = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < r+1; j++) {
                if (idade[i] > 18){
                    System.out.println("Maior de idade");
                }else {
                    System.out.println("Menor de idade");
                }
            }
        }

    }
}
