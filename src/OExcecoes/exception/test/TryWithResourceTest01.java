package OExcecoes.exception.test;

import OExcecoes.exception.test.dominio.Leitor01;
import OExcecoes.exception.test.dominio.Leitor02;

public class TryWithResourceTest01 {
    static void main() {
        lerArquivos();

    }

    public static void lerArquivos() {
        try (Leitor01 leitor01= new Leitor01();
             Leitor02 leitor02 = new Leitor02()) {


        } catch (Exception e) {

        }
    }
}
