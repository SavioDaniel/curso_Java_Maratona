# Exceções
- Conteúdo mque até então eu tive mais dificuldade de entender. Fiz a revisão de 11 aulas do canal DevDojo, e sinto que não aprendi nada.
- Então resolvi dá dois passos para trás e reasistir, ler e praticar o conteúdo para fixar melhor.
- Então esse Markdown vai servir como um resumo, para que sempre que surgir uma dúvida, eu venha aq consultar.

# Aula 1 - Errors 
- Antes de entrar no conteúdo de Errors. É importante entender de qual classe ela vem. 
- A classe java.lang é o coração do java e é onde estão as classes mais importantes do java, como a classe Object, String, Integer, etc. Quando se faz a importação de um arquivo Java, o java já importa automaticamente a classe java.lang, ou seja, não é necessário fazer a importação manualmente.

### Porque o Errors fica na classe java.lang?
- Como os Errors representam falhas graves na própria máquina virtual (JVM) ou no carregamento do programa, eles precisam estar no pacote mais básico e vital da linguagem.
- java.lang.Throwable (A mãe de todas as broncas)
- java.lang.Error (A mãe de todos os erros catastróficos)
- java.lang.VirtualMachineError (Problema na JVM)
- java.lang.OutOfMemoryError (Acabou a RAM)
- java.lang.StackOverflowError (Estouro de pilha)
- java.lang.LinkageError (Problema ao carregar as classes do seu código)
- java.lang.NoClassDefFoundError (Sumiu uma classe que o programa precisava)

## Errors
- Erros são problemas graves que ocorrem na JVM ou no ambiente de execução, e geralmente não podem ser recuperados. Eles indicam falhas que estão além do controle do programa, como falta de memória, falhas na máquina virtual, ou problemas de linkagem.
- Erros não devem ser capturados ou tratados pelo código do programa, pois eles indicam condições que não podem ser recuperadas. Em vez disso, eles devem ser deixados para a JVM lidar, o que geralmente resulta na terminação do programa.
- Exemplo de erro: OutOfMemoryError, StackOverflowError, VirtualMachineError.

### Exemplo java.lang.StackOverflowError
```java
package Oexerecao2.Errors;

public class Erros {
    static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
```          
- O código acima é um exemplo clássico de recursividade infinita, onde o método `recursividade()` chama a si mesmo sem uma condição de parada. Isso leva a um estouro de pilha (StackOverflowError) porque cada chamada ao método consome espaço na pilha de execução, e eventualmente a pilha se esgota.