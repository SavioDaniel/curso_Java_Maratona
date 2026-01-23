package DevSkills.curso_Java_Maratona;

public class Aula10_EstruturaDeRepetição {
    static void main() {
        // for , while, do-while, for-each
        int num = 0;
        while (num < 10){
            System.out.println(++num);
        }

        num = 0;
        do {
            System.out.println(++num);
        }while (num < 10);


        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
