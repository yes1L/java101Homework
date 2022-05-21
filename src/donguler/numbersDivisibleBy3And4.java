package donguler;

import java.util.Scanner;

public class numbersDivisibleBy3And4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k, a = 0, total = 0;

        System.out.print("Sayı giriniz : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                a++;
                total += i;

            }

        }
        double result = total / a;
        System.out.println("1'den girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması : "
                + result);
    }
}
