package POO.aula8;

public class SalvarAlunoUseCase {

    private AlunoGateway alunoGateway;

    public SalvarAlunoUseCase(AlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    public Long salvar(Aluno aluno) {

        if(aluno.isMenorIdade()) {
            throw new RuntimeException("O aluno é menor de idade: " + aluno.getIdade());
        }

        return alunoGateway.salvar(aluno);
    }
}
