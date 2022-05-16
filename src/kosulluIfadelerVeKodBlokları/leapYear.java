package kosulluIfadelerVeKodBlokları;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        //değişkenler
        int year;
        String leapYear = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = inp.nextInt();

        if ((year % 4) == 0) {
            leapYear = year + " bir artık yıldır.";
            if ((year % 100) == 0) {
                leapYear = year + " bir artık yıl değildir.";
                if ((year % 400) == 0) {
                    leapYear = year + " bir artık yıldır.";
                }
            }
            System.out.println(leapYear);
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
