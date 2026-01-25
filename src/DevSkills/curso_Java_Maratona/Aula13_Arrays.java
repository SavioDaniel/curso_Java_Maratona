package DevSkills.curso_Java_Maratona;

public class Aula13_Arrays {
    static void main() {
        String [] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Satoro";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++){
            System.out.printf("O %d° nome é: %s%n", (i+1), nomes[i]);
        }
        int cont = 0;
        while (cont < nomes.length){
            System.out.printf("O %d° nome é: %s%n", (cont+1), nomes[cont]);
            cont++;

        }
    }
}
