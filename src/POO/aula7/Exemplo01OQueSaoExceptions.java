package POO.aula7;

import java.util.Scanner;

public class Exemplo01OQueSaoExceptions {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final int taxa = 15;
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(taxa);

        int tarifa = obterTaxa();
        int custoFrete = calculadoraFrete.obterCustoFrete(tarifa);

        System.out.println("Custo frete: " + custoFrete);
    }

    private static int obterTaxa() {
        System.out.println("Informe a taxa: ");
        return SCANNER.nextInt();
    }
}
