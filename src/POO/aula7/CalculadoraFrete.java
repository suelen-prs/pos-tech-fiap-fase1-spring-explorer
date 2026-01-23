package POO.aula7;

public class CalculadoraFrete {

    private Integer taxa;

    public CalculadoraFrete(Integer taxa) {
        this.taxa = taxa;
    }

    public int obterCustoFrete(int tarifa) {
        return taxa / tarifa;
    }
}
