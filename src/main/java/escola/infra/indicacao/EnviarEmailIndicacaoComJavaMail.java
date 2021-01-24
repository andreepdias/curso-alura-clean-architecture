package escola.infra.indicacao;

import escola.aplicacao.indicacao.EnviarEmailIndicacao;
import escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarParaAluno(Aluno indicado) {
        // lógica de envio de email
    }
}
