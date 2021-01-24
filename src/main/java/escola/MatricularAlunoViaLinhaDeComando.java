package escola;

import escola.aplicacao.aluno.matricular.MatricularAluno;
import escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.CPF;
import escola.dominio.aluno.Email;
import escola.dominio.aluno.RepositorioDeAlunos;
import escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "André Dias";
        String cpf = "123.456.789-88";
        String email = "andre@dias.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.matricular(new MatricularAlunoDTO(nome, cpf, email));

    }
}
