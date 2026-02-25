package introducaoPrivate.test;

import java.util.Scanner;
import introducaoPrivate.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano1 = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valor1 = scanner.nextDouble();
        scanner.nextLine(); // limpa ENTER

        System.out.print("Digite o modelo: ");
        String modelo1 = scanner.nextLine();

        carro.setAno(ano1);
        carro.setValor(valor1);
        carro.setModelo(modelo1);

        System.out.println("\n--- Dados do Carro ---");
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getValor());
    }
}