package introducaoMetodos.Test;

import introducaoMetodos.Dominio.Estudante;
import introducaoMetodos.Dominio.ImprimeEstudante;

public class EstudanteTest {
    static void main() {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Estudante estudante3 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();


        estudante1.nome = "Sávio";
        estudante1.idade = 13;
        estudante1.sexo = 'M';

        estudante2.nome = "Daniel";
        estudante2.idade = 23;
        estudante2.sexo = 'M';

        estudante3.nome = "Rebeca";
        estudante3.idade = 20;
        estudante3.sexo = 'F';



        impressora.Imprime(estudante1);
        impressora.Imprime(estudante2);
        impressora.Imprime(estudante3);
        System.out.println("--------------");



    }
}
