package introducaoPrivate.dominio;

import java.util.Locale;

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
        this.modelo = modelo.toUpperCase(Locale.ROOT);
    }

    public void setValor(double valor) {
        if (valor > 0){
            this.valor = valor;
        }else {
            System.out.println("Valor errado");
        }
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }else {
            System.out.println("Ano errado");
        }
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
