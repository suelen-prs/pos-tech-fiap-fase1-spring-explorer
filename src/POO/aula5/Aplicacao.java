package POO.aula5;

public class Aplicacao {
    public static void main(String[] args) {
        Condominio condominio = obterDoBancoDados();

        Double obterValorTotalBoletos = condominio.obterValorTotalBoletos();

        System.out.println(obterValorTotalBoletos);

        AreaLazer areaLazer = new AreaLazer();
        boolean estaDisponivel = areaLazer.estaDisponivel();

        AreaLazerChurrasqueira areaLazerChurrasqueira = new AreaLazerChurrasqueira();
        boolean estaDisponivelChurrasco = areaLazerChurrasqueira.estaDisponivel();
    }

    private static Condominio obterDoBancoDados() {
        return new Condominio();
    }
}
