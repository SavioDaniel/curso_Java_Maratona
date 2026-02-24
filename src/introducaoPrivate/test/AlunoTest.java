package introducaoPrivate.test;

import introducaoPrivate.dominio.Aluno;
import introducaoPrivate.dominio.Imprime;

public class AlunoTest {
    static void main() {
        Aluno aluno = new Aluno();
        Imprime imprimeAluno = new Imprime();
        aluno.setNome("Sávio");
        aluno.setIdade(34);
        aluno.setSexo("Homem");

        imprimeAluno.print(aluno);



    }
}
