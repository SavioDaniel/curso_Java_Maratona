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

__________________________________________________________________________________________________________________________________________________________________________

# Diferença entre Exceção e Erro
- A principal diferença entre exceção e erro é que as exceções são condições anormais que podem ser tratadas pelo programa, enquanto os erros são condições graves que geralmente não podem ser recuperadas.
- Os Errors indicam problemas sérios que, na maioria das vezes, o seu programa não deveria tentar capturar. Eles geralmente estão relacionados ao ambiente de execução ou a falhas críticas na infraestrutura (JVM, CLR, etc.).

### tabela de comparação:
| Característica | Exception | Error |
| :--- | :--- | :--- |
| **Recuperável?** | Sim, através de blocos `try-catch`. | Geralmente não. |
| **Origem** | Causada pela aplicação ou dados. | Causada pelo ambiente ou falha de infraestrutura. |
| **Ação Recomendada** | Tratar o erro e seguir em frente. | Logar o erro e encerrar a aplicação. |
| **Exemplo Clássico** | Senha incorreta ou ficheiro em falta. | Falta de memória RAM ou erro interno da JVM. |

__________________________________________________________________________________________________________________________________________________________________________

# TRY
- O try é o seu "escudo" no código. Você o usa quando vai executar uma operação que tem chances reais de falhar por motivos que fogem do seu controle total (como rede, arquivos ou entrada do usuário).
- Dentro do bloco try, você coloca o código que pode lançar uma exceção. Se tudo correr bem, o código é executado normalmente. Mas se algo der errado, a execução é interrompida e o controle é passado para o bloco catch correspondente, onde você pode lidar com a situação de erro de forma apropriada.
```javatry {
    // Código que pode lançar uma exceção
} catch (TipoDeExceção e) {
    // Código para lidar com a exceção
}
```
- O try é essencial para garantir que seu programa seja robusto e capaz de lidar com situações inesperadas sem travar ou apresentar comportamentos indesejados. Ele permite que você capture e trate erros de maneira controlada, melhorando a experiência do usuário e a estabilidade do seu aplicativo.
__________________________________________________________________________________________________________________________________________________________________________
# CATCH
- Tecnicamente, o catch pode ficar vazio (o código vai compilar e rodar), mas na imensa maioria das vezes, isso é considerado uma das piores práticas de programação.
- Um bloco catch vazio é problemático porque ele suprime a exceção sem fornecer qualquer informação sobre o que deu errado, tornando a depuração e a manutenção do código muito mais difíceis. Ele pode esconder erros que deveriam ser corrigidos, levando a comportamentos inesperados ou falhas silenciosas no programa.
- Em vez de deixar um bloco catch vazio, é importante pelo menos registrar a exceção ou fornecer uma mensagem de erro significativa para ajudar na identificação e resolução do problema. Isso torna o código mais robusto e facilita a manutenção futura, além de melhorar a experiência do usuário ao lidar com erros de forma adequada.
```javatry {
    // Código que pode lançar uma exceção
} catch (TipoDeExceção e) {
    // Código para lidar com a exceção, como registrar o erro ou mostrar uma mensagem ao usuário
}
```     
| Abordagem | Impacto | Recomendação |
| :--- | :--- | :--- |
| **Catch Vazio** | O erro desaparece, o sistema fica imprevisível e o debug é impossível. | **Evitar a todo o custo.** |
| **Apenas Log** | O erro é registado, permitindo análise posterior, mas o app continua. | **Mínimo aceitável.** |
| **Relançar (Throw)** | O erro é passado para o nível superior que sabe como resolvê-lo. | **Boa prática (se não puder tratar).** |
| **Tratamento Real** | O código corrige o problema (ex: tenta uma rota alternativa). | **Ideal / Excelente.** |    

__________________________________________________________________________________________________________________________________________________________________________
# FINALLY
- O bloco `finally` é uma parte opcional de um bloco `try-catch` que é executada independentemente de uma exceção ter sido lançada ou não. Ele é usado para garantir que um código específico seja executado, como liberar recursos, fechar conexões ou realizar limpeza, mesmo que ocorra um erro durante a execução do bloco `try`.
- O código dentro do bloco `finally` será executado após o bloco `try` e qualquer bloco `catch` correspondente, garantindo que as ações de limpeza ou liberação de recursos sejam realizadas, mesmo em casos de falha. Isso é especialmente importante para evitar vazamentos de recursos, como conexões de banco de dados ou arquivos abertos, que podem causar problemas de desempenho ou falhas no sistema se não forem tratados adequadamente.
```java
try {
    // Código que pode lançar uma exceção
} catch (TipoDeExceção e) {
    // Código para lidar com a exceção
} finally {
    // Código que será executado independentemente de uma exceção ter sido lançada ou não
}
```
____________________________________________________________________________________________________________________________________________________________________________

# Debug
- O processo de depuração (debug) é essencial para identificar e corrigir erros em um programa. Ele envolve a análise do código para entender o fluxo de execução e localizar pontos onde o comportamento do programa não é o esperado. Ferramentas de depuração, como breakpoints e inspeção de variáveis, permitem que os desenvolvedores examinem o estado do programa em tempo real, facilitando a identificação de bugs e a compreensão de como o código está funcionando. A depuração é       
- uma habilidade crucial para qualquer programador, pois ajuda a garantir que o software seja confiável e funcione corretamente, além de melhorar a qualidade do código e a experiência do usuário.       
- A depuração eficaz pode economizar tempo e recursos, evitando que erros passem despercebidos e causem problemas maiores no futuro.    
- Além disso, a depuração é uma parte fundamental do processo de desenvolvimento de software, permitindo que os desenvolvedores iterem rapidamente e melhorem continuamente seus aplicativos.


