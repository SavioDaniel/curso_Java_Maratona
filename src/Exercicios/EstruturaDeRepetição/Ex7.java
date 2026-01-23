package Exercicios.EstruturaDeRepetição;
//Usando for, imprima a tabuada do 3 (de 1 a 10).
public class Ex7 {
    static void main() {
        int num = 3;
        System.out.println("----------- "+ num +"------------");
        for (int i =1; i<=10; i++){
            System.out.println(" "+ num +" x "+ i +" = "+(num * i)+" ");
        }
    }
}
