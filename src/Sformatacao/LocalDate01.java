package Sformatacao;

import java.time.LocalDate;

public class LocalDate01 {
    static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate vencimento = LocalDate.of(2024, 12, 31);
        System.out.println(vencimento);

        System.out.printf("%d/%d/%d", localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());

        //System.out.printf("%d/%d/%d%n", localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
    }
}
