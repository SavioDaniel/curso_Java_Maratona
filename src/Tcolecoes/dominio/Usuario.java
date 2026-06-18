package Tcolecoes.dominio;

public class Usuario implements Comparable<Usuario>{
    private long id;
    private String nome;
    private String pais;

    public Usuario(long id, String nome, String pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
    }

    @Override
    public int compareTo(Usuario o) {
        return Long.compare(this.id, o.getId());
    }

    @Override
    public String toString() {
        return "Usuario " +
                "\nid: " + id +
                "\nnome: " + nome +
                "\npais: " + pais;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
