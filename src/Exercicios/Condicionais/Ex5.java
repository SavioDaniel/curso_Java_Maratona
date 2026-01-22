package Exercicios.Condicionais;
/*Considere int a = 5, int b = 5, int c = 5.
Verifique o tipo de triângulo:
Equilátero
Isósceles
Escaleno*/
public class Ex5 {
    static void main() {
        int a = 3;
        int b = 3;
        int c = 6;
        
        if (a == b && b == c){
            System.out.println("Equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isósceles");
        }else {
            System.out.println("Escaleno");
        }
    }
}
