import java.lang.reflect.Array;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Turma turmaA = new Turma();

        turmaA.identificacao = "Grupo5";
        turmaA.nomeProfessor = "Pró Neia";
        turmaA.alunos = new Aluno[3];

        turmaA.alunos[0] = new Aluno();
        turmaA.alunos[0].nome = "Isaac Andrade da Silva";
        turmaA.alunos[0].idade = 6;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Heitor Dantas";
        aluno2.idade = 5;
        turmaA.alunos[1]=aluno2;

        turmaA.alunos[2] = new Aluno();
        turmaA.alunos[2].nome = "Felipe Aguiar";

        Turma turmaB = new Turma();
        turmaB.alunos = new Aluno[10];
        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "Luma";


        Aluno aluno4 = new Aluno();

        for (Aluno nomeAluno : turmaA.alunos){
            System.out.println(nomeAluno.nome);
        }

        for (Aluno nomeAluno : turmaB.alunos){
            System.out.println(nomeAluno.nome);
        }


    }
}
