package escola.aplicacao.aluno;

import escola.aplicacao.aluno.matricular.MatricularAluno;
import escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.CPF;
import escola.dominio.aluno.RepositorioDeAlunos;
import escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {

    @Test
    @DisplayName("Deveria persistir aluno.")
    void persistirAluno(){
        RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dto = new MatricularAlunoDTO("André", "123.456.789-00", "andre.dias@msn.com");
        useCase.matricular(dto);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("André", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("andre.dias@msn.com", encontrado.getEmail());
    }
}
