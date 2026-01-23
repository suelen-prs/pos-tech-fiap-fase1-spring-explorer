package POO.aula7;

public class ClasseB {
    private ClasseC classeC;

    public ClasseB(ClasseC classeC) {
        this.classeC = classeC;
    }

    public void metodoB() {
        classeC.metodoC();
    }
}
