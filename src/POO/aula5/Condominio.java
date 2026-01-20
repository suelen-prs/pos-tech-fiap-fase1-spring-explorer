package POO.aula5;

import java.util.List;

public class Condominio {
    private String nome;
    private List<Predio> predios;

    public Double obterValorTotalBoletos() {
        double valorTotal = 0;
        for (Predio predio : predios) {
            valorTotal =+predio.obterCustoApartamentos();
        }
        return valorTotal;
    }
}
