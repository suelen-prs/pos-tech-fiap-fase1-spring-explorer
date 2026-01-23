package POO.aula7;

public class TipoExcecoes {

    public void metodoLancaException() throws Exception {
        //Exceções Checadas
        throw new Exception("Mensagem de erro");
    }

    public void metodoLancaRuntimeException() {
        //Exceções NÃO checadas
        throw new RuntimeException("Mensagem de erro de novo");
    }

    public void metodoLancaError() {
        //Exceções NÃO checadas
        throw new Error("Já tá de brincadeira né");
    }
}
