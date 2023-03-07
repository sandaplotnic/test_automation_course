package topic4;

public class Methods {
    static void sum(int max) {

        if (max > 0) {
            int i = 0;
            int sum = 0;

            while (i < max) {
                sum += i;
                i++;
            }
            System.out.println("Sum of numbers from 0 to " + max + " is: " + sum);

        }
        else if (max < 0) {
            System.out.println("Value is negative");

        } else {
            System.out.println("Value is zero");
        }


    }


    static int sum(int min, int max) {
        int sum = 0;
        if (min > max) {
            System.out.println("Numerele sunt introduse în ordinea greșita");
            return 0;
        } else if (min == max) {
            System.out.println("Numerele sunt egale");
            return min;
        } else {
            for (int i = min; i <= max; i++)
                sum += i;
            System.out.println("Suma este: " + sum);
            return sum;
        }
    }
}
