import java.util.Arrays;

public class Turma {
    Aluno[] alunos = new Aluno[0];
    String identificacao;
    String nomeProfessor;

    void adicionarAluno (Aluno aluno) {
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        this.alunos[this.alunos.length-1]=aluno;
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos){
            System.out.println(aluno.nome + " - " + aluno.idade + " anos ");
        }
    }
}
