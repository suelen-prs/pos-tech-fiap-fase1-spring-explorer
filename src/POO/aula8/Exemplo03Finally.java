package POO.aula8;

public class Exemplo03Finally {

    public static void main(String[] args) {

        //Como e quando lançar exception:
        SalvarAlunoUseCase salvarAlunoUseCase = new SalvarAlunoUseCase((new AlunoGatewayImpl()));
        Aluno aluno = new Aluno(1L, "Nestor", 18);

        try {
            salvarAlunoUseCase.salvar(aluno);

        }catch (Exception e) {
            System.err.println(e.getMessage());
            NotificarResponsavelUseCase notificarResponsavelUseCase = new NotificarResponsavelUseCase();
            notificarResponsavelUseCase.notificar(aluno.getId());

        } finally {
            //Sempre será executado
            NotificarAdministradorSistemaUseCase notificarAdministradorSistemaUseCase = new NotificarAdministradorSistemaUseCase();
            notificarAdministradorSistemaUseCase.notificar();

        }
        System.out.println("Fim");
    }
}
