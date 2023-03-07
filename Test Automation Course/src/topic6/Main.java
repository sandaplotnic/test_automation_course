package topic6;

public class Main {
    public static void main(String[] args) {
        ContulPersoanei contulPersoanei = new ContulPersoanei();
        try {
            contulPersoanei.sustragereDeBani();

        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            contulPersoanei.setSumaCurenta(-423.10);
        } catch (Exception e) {

            System.out.println(e);

        }

        try {
            contulPersoanei.sustragereDeBani();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
