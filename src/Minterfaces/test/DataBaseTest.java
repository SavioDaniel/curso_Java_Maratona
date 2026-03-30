package Minterfaces.test;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.FIleloader;

public class DataBaseTest {
    static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FIleloader fIleloader = new FIleloader();
        dataBaseLoader.load();
        fIleloader.load();
        System.out.println("----------------");
        dataBaseLoader.remove();
        fIleloader.remove();
        System.out.println("-----------------");
        dataBaseLoader.chekresister();
        fIleloader.chekresister();

    }
}
