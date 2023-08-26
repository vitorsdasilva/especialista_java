import java.lang.reflect.Array;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Turma turmaA = new Turma();

        turmaA.identificacao = "Grupo5";
        turmaA.nomeProfessor = "Pró Neia";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Isaac Andrade da Silva";
        aluno1.idade = 6;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Heitor Dantas";
        aluno2.idade = 5;

        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.imprimirListaDeAlunos();

    }
}
