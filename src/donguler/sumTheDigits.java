package donguler;

import java.util.Scanner;

public class sumTheDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = inp.nextInt();
        int tempNumber = number;
        int basNumber = 0;
        int basValue;
        int basPow;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }
        System.out.println(number + " sayısının basamak sayılarının toplamı : " + result);
    }
}
