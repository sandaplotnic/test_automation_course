package topic3;

public class Operations {
    static void printAritmeticOperations() {
        int x = 45;
        int y = 23;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

    }

    static void printLogicOperations() {
        System.out.println((15 > 13) && (18 > 15));
        System.out.println((15 > 13) && (18 < 15));

        System.out.println((15 > 13) || (18 < 15));
        System.out.println((15 < 13) || (18 < 15));

        System.out.println(!(15 == 13));
        System.out.println(!(15 > 13));
    }

    static void printRelationalOperations() {
        int x = 17, y = 33;

        System.out.println("x = " + x + " and y = " + y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
    }

    static void printUseForAndWhile() {
        for (int i = 4; i < 32; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



