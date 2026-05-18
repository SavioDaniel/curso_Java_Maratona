package Oexececao.exception.test;

import Oexececao.exception.test.dominio.Leitor01;
import Oexececao.exception.test.dominio.Leitor02;

import java.io.BufferedReader;
import java.io.FileReader;

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
