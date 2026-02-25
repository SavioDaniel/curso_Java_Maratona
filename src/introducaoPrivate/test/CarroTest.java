package introducaoPrivate.test;
import java.util.Scanner;
import introducaoPrivate.dominio.Carro;
import introducaoPrivate.dominio.Imprime;

public class CarroTest {
    static void main(String[] args) {
        //Bibliotecas
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

        // parte que eu uso o scanner para da valores
        System.out.println("Qual o modelo do carro: ");
        String modelo1 = scanner.nextLine();

        System.out.println("Ano do carro: ");
        int ano1 = scanner.nextInt();

        System.out.println("Valor do carro: ");
        double valor1 = scanner.nextDouble();


        //função set
        carro.setModelo(modelo1);
        carro.setAno(ano1);
        carro.setValor(valor1);

        //função que usa o get.
        System.out.println("______________________");
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getValor());

    }
}
