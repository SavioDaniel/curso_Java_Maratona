package DevSkills.curso_Java_Maratona;

public class Aula4_OperadoresAritmeticosParte3 {
    static void main() {
        // && (And), || (Or)
        int idade = 21;
        float salario = 3500f;

        boolean MaiorQueVinte = idade > 20 && salario >= 4000;
        boolean MenorQueVinte = idade < 20 && salario >= 4000;

        System.out.println("Caso 1°: " + MaiorQueVinte); //
        System.out.println("Caso 2°: " + MenorQueVinte); //
    }
}
