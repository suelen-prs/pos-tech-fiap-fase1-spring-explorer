package POO.aula6;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        List<Automovel> automoveisQuePrecisamTrocarOleo = obterDoBancoDados();
        for (Automovel automovel : automoveisQuePrecisamTrocarOleo) {
            automovel.trocarOleo();
        }
    }

    private static List<Automovel> obterDoBancoDados() {
        List<Automovel> automoveis = new ArrayList<>();
        automoveis.add(new Carro());
        automoveis.add(new Onibus());

        return automoveis;
    }
}
