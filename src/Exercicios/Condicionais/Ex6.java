package Exercicios.Condicionais;
/*Considere int ano = 2024.
Verifique se o ano é bissexto.*/
public class Ex6 {
    static void main() {
        int ano = 2028;

        if (ano % 4 == 0){
            System.out.println("Ano bissexto");
        }else {
            System.out.println("Não é Bissexto");
        }
    }
}
