package POO.aula7;

public class Exemplo03TipoExcecoesJava {

    public static void main(String[] args) throws Exception { //Se não lançar aqui
        TipoExcecoes tipoExcecoes = new TipoExcecoes();

        tipoExcecoes.metodoLancaError();

        tipoExcecoes.metodoLancaRuntimeException();

        tipoExcecoes.metodoLancaException(); //pode fazer a tratativa do try-catch

    }
}
