package donguler;

import java.util.Scanner;

public class findingMinAndMaxValues {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, n, max = 0, min = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz : ");
            number = inp.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
