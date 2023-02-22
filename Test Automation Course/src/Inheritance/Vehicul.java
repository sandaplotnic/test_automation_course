package Inheritance;

public class Vehicul {
    String culoare;
    int nrRoti;

    public Vehicul(String culoare) {
        this.culoare = culoare;
    }

    public Vehicul(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void afiseazaDetaliiVehicul () {
        System.out.println("Vehicul de culoare:"+ culoare +" cu numar de roti:" + nrRoti);

    }
}
