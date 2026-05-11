# Exceções - Erros

- Exceções são erros que ocorrem durante a execução de um programa. Elas podem ser causadas por diversos fatores, como entrada de dados inválida, problemas de conexão, ou erros de lógica no código.
- Um caso comum é a excerção por memoria cheia, onde o programa tenta alocar mais memória do que o disponível, resultando em um erro.
- Para lidar com exceções, é importante usar blocos de código de tratamento de erros,

public class main {
public static void main() {
recursividade();
}
```java
   public class main {
    public static void main() {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
```
- No exemplo acima, a função `recursividade` chama a si mesma indefinidamente, o que eventualmente levará a um erro de estouro de pilha (StackOverflowError) devido à falta de memória para continuar as chamadas recursivas.

_________________________________________________________________________________________________________________________________________________________________________

# Excerções - RuntimeException

- `RuntimeException` é uma classe de exceção em Java que representa erros que ocorrem durante a execução do programa. Ela é uma subclasse de `Exception` e é usada para indicar erros que podem ser evitados pelo programador, como erros de lógica ou uso incorreto de APIs.

- Exemplos comuns de `RuntimeException` incluem `NullPointerException`, `ArrayIndexOutOfBoundsException`, e `IllegalArgumentException`. Essas exceções geralmente indicam que o programa tentou acessar um recurso que não existe ou usou um argumento inválido.
- Para lidar com `RuntimeException`, é importante usar blocos de código de tratamento de erros, como `try-catch`, para capturar e tratar essas exceções de forma adequada, garantindo que o programa continue a funcionar mesmo quando ocorrem erros inesperados.