package Sformatacao;

import java.util.Date;
import java.text.SimpleDateFormat;
public class SimpleDateFormat01 {
    static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
