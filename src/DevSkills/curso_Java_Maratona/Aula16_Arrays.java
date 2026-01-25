package DevSkills.curso_Java_Maratona;

public class Aula16_Arrays {
    static void main() {
        int [][] numb = new int[3][3];

        numb[0][0] = 12;
        numb[0][1] = 3;
        numb[0][2] = 67;

        numb[1][0] = 10;
        numb[1][1] = 34;
        numb[1][2] = 53;

        numb[2][0] = 24;
        numb[2][1] = 19;
        numb[2][2] = 56;

        for (int[] i: numb) {
            for (int num: i){
                System.out.println(num);
            }
        }
    }
}
