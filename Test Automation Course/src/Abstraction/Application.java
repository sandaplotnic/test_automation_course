package Abstraction;

public class Application {
    public static void main(String[] args) {

        FormaGeometrica formaGeometrica = new Triunghi();
        FormaGeometrica formaGeometrica1 = new Patrat();

        formaGeometrica.calculArie();
        formaGeometrica1.calculArie();
    }
}
