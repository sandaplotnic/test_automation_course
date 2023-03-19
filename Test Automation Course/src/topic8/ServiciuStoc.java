package topic8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte carte1 = new Carte("The Great Gatsby", "F. Scott Fitzgerald", 5456, 208);
        Carte carte2 = new Carte("Nineteen Eighty-Four", "George Orwell", 7567, 328);
        Carte carte3 = new Carte("To Kill a Mockingbird", "Harper Lee", 57989, 281);
        Carte carte4 = new Carte("Pride and Prejudice", "Jane Austen", 46890, 1 - 36);

        Stoc stoc = new Stoc(58679, "Stefan cel Mare St 35, Balti, Moldova");
        System.out.println("Stocul este gol: " + stoc.esteStoculGol());

        stoc.adaugaCarteStoc(carte1);
        stoc.adaugaCarteStoc(carte2);
        stoc.adaugaCarteStoc(carte3);
        stoc.adaugaCarteStoc(carte4);

        System.out.println("Stocul este gol: " + stoc.esteStoculGol());
        System.out.println("Numar de de carti in stoc: " + stoc.nrDeCartiInStoc());

        System.out.println("Cartea nr. 1 este in stoc: " + stoc.existaCarteInStoc(carte1));
        System.out.println("Cartea nr. 3 este in stoc: " + stoc.existaCarteInStoc(carte3));


        System.out.println("Cartea 3 este in stoc: " + stoc.existaCarteInStoc(carte1));
        System.out.println("Numarul de carti in stoc: " + stoc.nrDeCartiInStoc());
    }

}
