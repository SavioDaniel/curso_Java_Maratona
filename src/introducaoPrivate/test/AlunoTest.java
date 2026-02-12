package introducaoPrivate.test;

import introducaoPrivate.dominio.Aluno;
import introducaoPrivate.dominio.ImprimeAluno;

public class AlunoTest {
    static void main() {
        Aluno aluno = new Aluno();
        ImprimeAluno imprimeAluno = new ImprimeAluno();
        aluno.setNome("Sávio");
        aluno.setIdade(-34);
        aluno.setSexo("Homem");

        imprimeAluno.print(aluno);



    }
}
