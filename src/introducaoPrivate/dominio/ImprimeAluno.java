package introducaoPrivate.dominio;

public class ImprimeAluno {
    public void print(Aluno aluno){
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getSexo());
    }
}
