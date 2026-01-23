package POO.aula7;

public class ClasseA {

    private ClasseB classeB;

    public ClasseA(ClasseB classeB) {
        this.classeB = classeB;
    }

    public void metodoA() {
        classeB.metodoB();
    }
}
