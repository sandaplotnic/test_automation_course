package Inheritance;

public class Masina extends Vehicul {
    String marca;

    public Masina(String marca, String culoare) {
        super(culoare);
        this.marca = marca;
    }

    @Override
    public void afiseazaDetaliiVehicul() {
        System.out.println("Masina de culoare:"+ culoare +" cu numar de roti:" + nrRoti + " si marca masinii:" + marca);
    }
}
