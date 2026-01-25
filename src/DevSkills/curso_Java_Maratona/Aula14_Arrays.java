package DevSkills.curso_Java_Maratona;

public class Aula14_Arrays {
    static void main() {
        int[] idade1 = new int[3];
        int[] idade2 = {14, 45, 63, 75, 89};
        int[] idade3 = new int[]{32, 42, 67, 80};

        /*for (int i = 0; i < idade2.length; i++){
            System.out.println(idade2[i]);
        }*/

        for (int num: idade2){
            System.out.println(num);
        }
    }
}
