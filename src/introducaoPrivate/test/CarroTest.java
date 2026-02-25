package introducaoPrivate.test;

import introducaoPrivate.dominio.Carro;

public class CarroTest {
    static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Camaro");   // define
        System.out.println(carro.getModelo());
    }
}
