package topic2;

public class Main {
    public static void main(String args[]){
        Persoana person1 = new Persoana ();
        person1.gen = "feminin";
        person1.prenume = "Irina";
        person1.nume = "Turcan";
        person1.varsta = 29;
        person1.setGreutate(50);
        System.out.println(person1.nume + " " + person1.prenume + "; " + "gen:" + person1.gen + "; varsta:" + person1.varsta + "; greutate:" + person1.getGreutate() );
    }
}
