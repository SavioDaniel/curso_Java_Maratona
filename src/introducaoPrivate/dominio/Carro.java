package introducaoPrivate.dominio;

public class Carro {
    private String modelo;
    private int ano;
    private double valor;


    //Imprime os valores
    public  void Imprime(){
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.valor);
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValor() {
       return valor;
    }

    public int getAno() {
        return ano;
    }
}
