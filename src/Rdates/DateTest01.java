package Rdates;

import java.util.Date;

public class DateTest01 {
    static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() +  24);
        System.out.println(date);
    }
}
