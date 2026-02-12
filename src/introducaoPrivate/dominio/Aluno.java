package introducaoPrivate.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }


}
