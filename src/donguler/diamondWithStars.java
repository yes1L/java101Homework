package donguler;

import java.util.Scanner;

public class diamondWithStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Ortadaki basamak sayısını giriniz : ");
        int n = inp.nextInt();

        // Elmas üst yarısından ortasına kadar.
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Elmas ortasından altına kadar.
        for (int i = 1; i <= n - 1; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2 * n) - 1) - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
