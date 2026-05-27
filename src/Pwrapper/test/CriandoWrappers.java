package Pwrapper.test;

import java.util.HashMap;

public class CriandoWrappers {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Savio");
        map.put(20, "Maria");
        map.put(30, "João");
        System.out.println(map.get(20));

    }
}
