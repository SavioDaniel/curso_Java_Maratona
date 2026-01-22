package DevSkills.curso_Java_Maratona;

public class Aula6_EstruturasCondicionais1 {
    static void main() {
        int idade = 20;
        boolean Autorizar = idade <= 18;
        if (Autorizar){
            System.out.println("Vc é menor de idade");
        }
        if (!Autorizar){
            System.out.println("Vc é maior de idade");
        }
    }
}
