package Exercicios.Condicionais;
/*Considere:
int hora = 22
boolean fimDeSemana = false
Imprima:
"Pode entrar" se hora ≥ 18 && for fim de semana
"Pode entrar" se hora ≥ 21 && não for fim de semana
Caso contrário, "Entrada negada"*/
public class Ex8 {
    static void main() {
        int hora = 18;
        boolean fimDeSemana = true;

        if ((hora >= 18 && fimDeSemana == true) || (hora >= 21 && fimDeSemana == false)){
            System.out.println("Pode Entrar.");
        } else  {
            System.out.println("Entrada Negada");
        }
    }
}
