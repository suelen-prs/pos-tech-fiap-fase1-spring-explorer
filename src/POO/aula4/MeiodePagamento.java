package POO.aula4;

public interface MeiodePagamento {

    void pagar(Pedido pedido);
    void estorno(Pedido pedido);
}
