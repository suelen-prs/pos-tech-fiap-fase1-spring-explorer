package POO.aula6;

public class Carro extends Automovel{

    @Override
    protected void trocarOleo() {
        System.out.println("Logica especifica de carro");
    }
}
