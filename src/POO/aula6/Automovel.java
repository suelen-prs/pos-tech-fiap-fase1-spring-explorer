package POO.aula6;

public abstract class Automovel {
    private double quantidadeCombustivel;
    private double quilometroLitro;

    protected void abastecer(double litroCombustivel){
        //TODO: logica abastecer
        System.out.println();
    }

    protected void consumir(double quilometros){
        //TODO: logica para consumir combustivel
        System.out.println();
    }

    protected double distanciaMaximaPercorrida(){
        //TODO: logica para distancia maxima percorrida
        System.out.println();
        return 0;
    }

    protected abstract void trocarOleo();
}
