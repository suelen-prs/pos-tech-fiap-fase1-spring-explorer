package POO.aula4;
import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caneta";
        produto.valor = 5.0D;

        Pedido pedido = new Pedido(Arrays.asList(produto));

        MeiodePagamento pagamento = obterMeioPagamento(args);
        pagamento.pagar(pedido);
    }

    private static MeiodePagamento obterMeioPagamento(String[] args) {
        //TODO: implementar regra que define o meio de pagamento
        return new MeioPagamentoPix();
    }
}

