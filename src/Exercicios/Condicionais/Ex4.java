package Exercicios.Condicionais;
/*Considere int nota = 5.
Imprima:
"Excelente" se nota ≥ 9
"Bom" se nota ≥ 7
"Regular" se nota ≥ 5
"Insuficiente" caso contrário*/
public class Ex4 {
    static void main() {
        int nota = -10;

        if (nota >= 9){
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        }else if (nota >= 5){
            System.out.println("Regular");
        }else if (nota < 5 && nota >= 0){
            System.out.println("Insuficiente");
        }else {
            System.out.println("Nota errada");
        }

    }
}
