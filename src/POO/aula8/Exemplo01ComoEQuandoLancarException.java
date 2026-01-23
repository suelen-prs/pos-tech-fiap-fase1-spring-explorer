package POO.aula8;

public class Exemplo01ComoEQuandoLancarException {

    public static void main(String[] args) {

        //Como e quando lançar exception:
        SalvarAlunoUseCase salvarAlunoUseCase = new SalvarAlunoUseCase(new AlunoGatewayImpl());
        Aluno aluno = new Aluno(1L, "Nome aluno", 18);
        salvarAlunoUseCase.salvar(aluno);

        System.out.println("Fim");
    }
}
