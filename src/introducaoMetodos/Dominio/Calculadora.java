package introducaoMetodos.Dominio;

public class Calculadora {

    public  void  somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(30-12);
    }

    public  void multiplicaDoisNumeros(int num1 , int num2){
        System.out.println(num1 * num2);
    }

    public  double divideDoisNumeros(double num1, double num2) {
        if (num2 ==0){
            System.out.println("Num2 não pode ser igual a 0.");
        }else {
            return num1/num2;
        }
        return 0;
    }
    public void divisao (double numb1,double numb2){
        if (numb2 ==0){
            System.out.println("Não existe divisãopor zero");
            return;
        }
            System.out.println(numb1 / numb2);

    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaArrayArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}


