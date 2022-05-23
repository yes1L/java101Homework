package donguler;

import java.util.Scanner;

public class sumTheDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = inp.nextInt();
        int tempNumber = number;
        int basValue;
        int result = 0;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }
        System.out.println(number + " sayısının basamak sayılarının toplamı : " + result);
    }
}
