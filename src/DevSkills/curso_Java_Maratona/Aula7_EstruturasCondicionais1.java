package DevSkills.curso_Java_Maratona;

public class Aula7_EstruturasCondicionais1 {
    static void main() {
        // if ; else if ; else

        int idade = 18;

        if(idade < 15 && idade > 10){
            System.out.println("Categoria Infantil");
        }else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }else if (idade >= 18){
            System.out.println("Adulto");
        }else {
            System.out.println("Dado errado");
        }
    }
}
