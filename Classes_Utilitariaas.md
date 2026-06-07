# LocalDate
- A classe LocalDate é uma classe do Java que representa uma data sem hora. Ela faz parte do pacote java.time e é imutável, o que significa que uma vez criada, seu valor não pode ser alterado. A classe LocalDate é útil para representar datas como aniversários, datas de eventos, ou qualquer outra data que não precise de informações de hora.
- A classe LocalDate fornece vários métodos para criar, manipular e formatar datas. Por exemplo, você pode criar uma instância de LocalDate usando o método estático of(), que aceita os parâmetros de ano, mês e dia. Você também pode usar o método now() para obter a data atual. Além disso, a classe LocalDate oferece métodos para adicionar ou subtrair dias, meses ou anos, bem como para comparar datas e formatá-las em diferentes estilos.
- Exemplo de uso da classe LocalDate:
```java
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        // Criando uma data específica
        LocalDate date1 = LocalDate.of(2022, 10, 5);
        System.out.println("Data 1: " + date1);

        // Obtendo a data atual
        LocalDate currentDate = LocalDate.now();
        System.out.println("Data atual: " + currentDate);

        // Adicionando dias a uma data
        LocalDate date2 = date1.plusDays(10);
        System.out.println("Data 2 (10 dias depois): " + date2);

        // Formatando a data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date1.format(formatter);
        System.out.println("Data 1 formatada: " + formattedDate);
    }
}
```
- Neste exemplo, criamos uma data específica usando o método of(), obtemos a data atual com o método now(), adicionamos 10 dias a uma data existente e formatamos a data usando um padrão personalizado. A classe LocalDate é uma ferramenta poderosa para trabalhar com datas em Java, permitindo que você manipule e formate datas de maneira eficiente e fácil.