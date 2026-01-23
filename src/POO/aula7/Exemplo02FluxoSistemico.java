package POO.aula7;

public class Exemplo02FluxoSistemico {

    public static void main(String[] args) {

        ClasseC classeC = new ClasseC();
        ClasseB classeB = new ClasseB(classeC);
        ClasseA classeA = new ClasseA(classeB);

        classeA.metodoA();

        System.out.println("Fim");
    }
}
