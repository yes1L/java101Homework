package donguler;

import java.util.Scanner;

public class invertedTriangleWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = input.nextInt();
        int a = 0;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2 * n) - (a + i)); j++) {
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
    }
}
