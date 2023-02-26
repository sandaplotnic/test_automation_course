package Encapsulation;

public class Application {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar();
        cont.setNumarCont(5893603);
        cont.setSold(346364);
        System.out.println("Cont bancar: " + cont.getNumarCont() + "&  sold: " + cont.getSold());
    }
}
