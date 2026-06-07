package Tcolecoes.test;

import Tcolecoes.dominio.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("123456", "Xiaomi");
        Smartphone s2 = new Smartphone("123456", "Xiaomi");
        Smartphone s3 = s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
