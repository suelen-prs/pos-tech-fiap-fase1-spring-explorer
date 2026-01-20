package POO.aula4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime dataCriacao;
    private Status status;
    private List<Produto> produtos;

    Pedido() {
        status = Status.ABERTO;
        dataCriacao =  LocalDateTime.now();
        produtos = new ArrayList<>();
    }

    Pedido(List<Produto> produtos) {
        this();
        this.produtos = produtos;
    }

    public double obterValor(){
        efetuarDesconto();
        //logica que obtem os valores
        //TODO: Implementar
        return 0;
    }

    //ESTE METODO DEVE SER PROTEGIDO
    private double efetuarDesconto(){
        //logica que obtem os valores
        //TODO: Implementar
        return 0;
    }

}
