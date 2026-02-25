package introducaoPrivate.test;
import java.util.Scanner;
import introducaoPrivate.dominio.Carro;
import introducaoPrivate.dominio.Imprime;

public class CarroTest {
    static void main(String[] args) {
        //Bibliotecas
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

        int ano1 = scanner.nextInt();
        int valor1 = sca
        //função set
        carro.setAno(ano1);
        carro.setValor(86.567);
        carro.setModelo("Camaro");

        //função que usa o get.

        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getValor());

    }
}
