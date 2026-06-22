package Tcolecoes.HashMap.teste;

import java.util.HashMap;
import java.util.Map;

public class Programa {
    static void main(String[] args) {
        Map<String, String> map = new HashMap();

        map.put("Savio", "sansung");
        map.put("Rebeca", "iphone");
        map.put("Andre", "motorola");
        map.put("Savio", "asus");

        for (String key: map.keySet()){
            System.out.println("Chave: " + key  + ", valor: " + map.get(key));
        }
    }
}