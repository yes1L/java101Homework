package donguler;

import java.util.Scanner;

public class perfectNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int a = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                a += i;
            }
        }
        if (number == a) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}
