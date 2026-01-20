package POO.aula4;

public class MeioPagamentoPix implements MeiodePagamento{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento via pix");
    }

    @Override
    public void estorno(Pedido pedido) {
        System.out.println("Estorndo do pix");
    }

}
