package POO.aula5;

import java.util.List;

public class Predio {
    private String nome;
    private List<Apartamento> apartamentos;
    private List<AreaLazer> areasLazer;

    public double obterCustoApartamentos() {
        double total = 0;
        for(Apartamento apartamento : apartamentos){
            total += apartamento.obterValorTotalBoletos();
        }
        return total;
    }
}
