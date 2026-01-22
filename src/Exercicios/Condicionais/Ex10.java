package Exercicios.Condicionais;
/*Considere:
double salario = 3200
Aplique:
+10% se salário < 2000
+7% se salário entre 2000 e 3000
+5% se salário > 3000
Imprima o salário final.*/
public class Ex10 {
    static void main() {
        double salario = 1200;
        double teste = 0;
        if (salario > 3000){
            teste = salario *  0.05;
            System.out.println("O Seu salário era de "+ salario +", com o aumento ficou "+(salario + teste)+" " );
        } else if (salario <=3000 && salario > 2000) {
            teste = salario * 0.07;
            System.out.println("O Seu salário era de "+ salario +", com o aumento ficou "+(salario + teste)+" ");
        } else if (salario <= 2000 && salario >= 0 ) {
            teste = salario * 0.10;
            System.out.println("O Seu salário era de "+ salario +", com o aumento ficou "+(salario + teste)+" ");
        } else {
            System.out.println("Valor errado");
        }
    }
}
