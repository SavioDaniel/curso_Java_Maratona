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

____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

# Aula 2 - Exceptions
- Exceptions são condições anormais que ocorrem durante a execução de um programa, mas que podem ser tratadas e recuperadas. Elas indicam situações que o programa pode lidar, como erros de entrada, falhas de rede, ou problemas de lógica.
- Exceptions são divididas em duas categorias principais: Checked Exceptions e Unchecked Exceptions.
- Checked Exceptions são aquelas que o compilador exige que sejam tratadas ou declaradas. Elas geralmente representam condições que o programa pode prever e lidar, como IOException, SQLException, etc.
- Unchecked Exceptions são aquelas que o compilador não exige que sejam tratadas ou declaradas. Elas geralmente representam erros de programação, como NullPointerException, ArrayIndexOutOfBoundsException, etc.             

## RuntimeExceptions
- RuntimeExceptions são um tipo específico de Unchecked Exceptions que ocorrem durante a execução do programa. Elas indicam erros de programação, como acesso a um índice fora dos limites de um array, tentativa de acessar um objeto nulo, ou divisão por zero.
- Exemplo de RuntimeException: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.

______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

# Aula 3 - Try, Catch 
- Try tem o significado de tentar. ele é utilizado quando vamos mexer com um codigo que pode ser nocivo para o programa, ou seja, um código que pode lançar uma exception. O try é utilizado para envolver esse código perigoso, e caso ocorra uma exception, o programa não vai quebrar, ele vai pular para o catch.
- Catch tem o significado de pegar. Ele é utilizado para pegar a exception que foi lançada no try, e tratar ela de alguma forma. O catch é utilizado para evitar que o programa quebre, e para dar uma resposta mais amigável para o usuário, ou para logar a exception de alguma forma.
- Sempre se usa o try e o catch juntos, pois o try é utilizado para envolver o código perigoso, e o catch é utilizado para pegar a exception que foi lançada no try.
- Por exemplo, se eu tiver um código que pode lançar uma NullPointerException, eu posso envolver esse código com um try, e pegar a NullPointerException com um catch, para evitar que o programa quebre.
- Resumindo. o try vai rodar o codigo, se algum momento o JVM encontrar uma falha. ele pula direto para o bloco catch, para fazeer o tratamento do erro la dentro. E o catch é onde a gente vai tratar a exception, seja logando ela, ou dando uma resposta mais amigável para o usuário, ou até mesmo ignorando ela, dependendo do caso.
- Pórem se o Try rodar o código e não encontrar nenhuma falha, ele vai pular o bloco catch, e continuar rodando o código normalmente. Ou seja, o catch só é executado se o try encontrar uma falha, caso contrário, ele é ignorado.
