package POO.aula8;

public class Exemplo02ComoeQuandoTratarException {

    public static void main(String[] args) {

        //Como e quando lançar exception:
        SalvarAlunoUseCase salvarAlunoUseCase = new SalvarAlunoUseCase(new AlunoGatewayImpl());
        Aluno aluno = new Aluno(1L, "Nestor", 17);

        try {
            salvarAlunoUseCase.salvar(aluno);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            NotificarResponsavelUseCase notificarResponsavelUseCase = new NotificarResponsavelUseCase();
            notificarResponsavelUseCase.notificar(aluno.getId());
        }

        System.out.println("Fim");
    }
}
