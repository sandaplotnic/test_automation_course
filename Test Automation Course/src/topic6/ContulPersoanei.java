package topic6;


public class ContulPersoanei {
    private String numePerosana;

    public String getNumePersoana() {
        return getNumePersoana();
    }

    public void setNumePerosana(String numePerosana) {
        this.numePerosana = numePerosana;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private double sumaCurenta;

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(double sumaCurenta) throws RuntimeException {
        if (sumaCurenta <= 0) {
            throw new RuntimeException("Suma nu poate fi negativa");
        }
        this.sumaCurenta = sumaCurenta;
    }

    public void sustragereDeBani() throws RuntimeException {
        if (sumaCurenta == 0) {
            throw new RuntimeException("Suma curenta este zero");

        }
        System.out.println("Suma curenta a fost extrasa");
        sumaCurenta = 0;
    }

}
