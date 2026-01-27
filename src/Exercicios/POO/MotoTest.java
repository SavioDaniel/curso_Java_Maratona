package Exercicios.POO;

public class MotoTest {
    static void main() {
        Moto moto = new Moto();
        Moto moto2 = new Moto();

        moto.nome = "CB500";
        moto.ano = 2026;
        moto.modelo = "Honda";

        moto2.nome = "Pop";
        moto2.ano = 2019;
        moto2.modelo = "Honda";

        System.out.println("-----------Moto 1----------");
        System.out.println(moto.nome);
        System.out.println(moto.ano);
        System.out.println(moto.modelo);
        System.out.println("\n----------Moto 2-----------");
        System.out.println(moto2.nome);
        System.out.println(moto2.ano);
        System.out.println(moto2.modelo);
    }
}
