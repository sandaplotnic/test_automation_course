public class Masina extends Vehicul {
    String marca;

    @Override
    public void afiseazaDetaliiVehicul() {
        System.out.println("Masina de culoare:"+ culoare +" cu numar de roti:" + nrRoti + " si marca masinii:" + marca);
    }
}
