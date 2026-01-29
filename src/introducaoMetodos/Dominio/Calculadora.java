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
}


