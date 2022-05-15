package kosulluIfadelerVeKodBlokları;

import java.util.Scanner;

public class flightTicketPriceCalculation {
    public static void main(String[] args) {
        //Değişkenler
        int distance, age, travelType;
        double ticketPrice, discountPrice, ageDiscount, roundTripDiscount, roundTripDiscountPrice;
        double discount1 = 0.50, discount2 = 0.10, discount3 = 0.30, discount4 = 0.20;

        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan veri alma
        System.out.print("Mesafeyi KM türünden giriniz : ");
        distance = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        travelType = inp.nextInt();

        if ((distance > 0) && (age > 0) && (travelType >= 1 && travelType <= 2)) {
            ticketPrice = distance * 0.10;
            if (age < 12) {
                if (travelType == 1) {
                    ageDiscount = ticketPrice * discount1;
                    discountPrice = ticketPrice - ageDiscount;
                    System.out.println("Toplam tutar : " + discountPrice);
                } else {
                    ageDiscount = ticketPrice * discount1;
                    discountPrice = ticketPrice - ageDiscount;
                    roundTripDiscount = discountPrice * discount4;
                    roundTripDiscountPrice = (discountPrice - roundTripDiscount) * 2;
                    System.out.println("Toplam tutar : " + roundTripDiscountPrice);
                }
            } else if (age < 24) {
                if (travelType == 1) {
                    ageDiscount = ticketPrice * discount2;
                    discountPrice = ticketPrice - ageDiscount;
                    System.out.println("Toplam tutar : " + discountPrice);
                } else {
                    ageDiscount = ticketPrice * discount2;
                    discountPrice = ticketPrice - ageDiscount;
                    roundTripDiscount = discountPrice * discount4;
                    roundTripDiscountPrice = (discountPrice - roundTripDiscount) * 2;
                    System.out.println("Toplam tutar : " + roundTripDiscountPrice);
                }
            } else if (age<65) {
                if (travelType == 1) {
                    System.out.println("Toplam tutar : " + ticketPrice);
                } else {
                    roundTripDiscount = ticketPrice * discount4;
                    roundTripDiscountPrice = (ticketPrice - roundTripDiscount) * 2;
                    System.out.println("Toplam tutar : " + roundTripDiscountPrice);
                }
            } else {
                if (travelType == 1) {
                    ageDiscount = ticketPrice * discount3;
                    discountPrice = ticketPrice - ageDiscount;
                    System.out.println("Toplam tutar : " + discountPrice);
                } else {
                    ageDiscount = ticketPrice * discount3;
                    discountPrice = ticketPrice - ageDiscount;
                    roundTripDiscount = discountPrice * discount4;
                    roundTripDiscountPrice = (discountPrice - roundTripDiscount) * 2;
                    System.out.println("Toplam tutar : " + roundTripDiscountPrice);
                }
            }


        } else
            System.out.println("Hatalı Veri Girdiniz!");


    }
}
