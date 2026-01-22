package Exercicios.Condicionais;
/*Considere int numero = -3.
Verifique se o número é positivo, negativo ou zero e imprima a mensagem correspondente.*/
public class Ex3 {
    static void main() {
     int num = -3;

     if (num == 0){
         System.out.println("Seu número é zero: " + num);
     } else if (num < 0) {
         System.out.println("Seu número é negativo: " + num);
     }else{
         System.out.println("Seu numero é positivo: " + num);
     }
    }
}
