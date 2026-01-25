package DevSkills.curso_Java_Maratona;

public class Aula15_Arrays {
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

        for (int i = 0; i < numb.length ; i++){
            for (int j = 0; j < numb[i].length; j++) {
                System.out.println(numb[i][j]);
            }
            System.out.println("");
        }
    }
}
