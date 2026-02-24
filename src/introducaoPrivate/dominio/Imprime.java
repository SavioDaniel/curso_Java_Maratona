package introducaoPrivate.dominio;

public class Imprime {
    public void print(Aluno aluno){
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getSexo());
    }

    static void main(String[] args) {

    }
}
