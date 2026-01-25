package DevSkills.curso_Java_Maratona;

public class Aula17_Arrays {
    static void main() {
        int[][] numb = new int[3][];

        numb[0] = new int[5];
        numb[1] = new int[2];
        numb[2] = new int[4];

        numb[0][0] = 12;
        numb[0][1] = 3;
        numb[0][2] = 67;
        numb[0][3] = 7;
        numb[0][4] = 78;

        numb[1][0] = 10;
        numb[1][1] = 34;

        numb[2][0] = 24;
        numb[2][1] = 19;
        numb[2][2] = 56;
        numb[2][3] = 6;

        for (int[] ArrayBase: numb){
            System.out.println();
            for (int num: ArrayBase){
                System.out.print(num + " ");
            }
        }

    }
}
