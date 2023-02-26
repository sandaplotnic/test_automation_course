package Inheritance;

public class Application {
    public static void main(String[] args) {

        Vehicul vehicul = new Vehicul("verde");
        vehicul.nrRoti = 4;
        Masina masina = new Masina("Mustang", "rosu");
        Masina masina2 = new Masina("Seat", "albastru");
        masina.nrRoti = 4;
        masina2.nrRoti = 4;


        vehicul.afiseazaDetaliiVehicul();
        masina.afiseazaDetaliiVehicul();
        masina2.afiseazaDetaliiVehicul();
    }
}


