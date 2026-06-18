package Tcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(0);
        number.add(65);
        number.add(43);
        number.add(39);

        Collections.sort(number);
        System.out.println(Collections.binarySearch(number, 43));
        System.out.println(Collections.binarySearch(number, -43));
    }
}
