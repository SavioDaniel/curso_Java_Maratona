package Exercicios.Condicionais;
/*int idade = 17
boolean acompanhado = true
Imprima "Entrada liberada" se idade ≥ 18 OU se idade ≥ 16 E estiver acompanhado.
Caso contrário, "Entrada proibida".*/
public class Ex9 {
    static void main() {
        int idade = 15;
        boolean acompanhado = true;

        if ((idade >= 18) || (idade >= 16 && acompanhado)){
            System.out.println("Entrada Liberada.");
        }else {
            System.out.println("Entrada Proibida");
        }
    }
}
