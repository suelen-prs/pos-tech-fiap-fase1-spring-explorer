package POO.aula5;

import java.util.List;

public class Apartamento {
    private String numero;
    private List<Morador> moradores;
    private List<Boleto> boletos;
    private List<Garagem> garagens;

    public double obterValorTotalBoletos() {
        double total = 0;
        for (Boleto boleto : boletos) {
            total =+ boleto.getValor();
        }
        return total;
    }
}
