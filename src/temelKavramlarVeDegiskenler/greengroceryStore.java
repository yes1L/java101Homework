package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class greengroceryStore {
    public static void main(String[] args) {
        double  armutPrice = 2.14,
                elmaPrice = 3.67,
                domatesPrice = 1.11,
                muzPrice = 0.95,
                patlicanPrice = 5.00,
                toplam;

        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        armutKg = inp.nextInt();
        System.out.print("Elma Kaç Kilo ? ");
        elmaKg = inp.nextInt();
        System.out.print("Domates Kaç Kilo ? ");
        domatesKg = inp.nextInt();
        System.out.print("Muz Kaç Kilo ? ");
        muzKg = inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? ");
        patlicanKg = inp.nextInt();

        toplam = armutKg*armutPrice + elmaKg*elmaPrice + domatesKg*domatesPrice + muzKg*muzPrice + patlicanKg*patlicanPrice;
        System.out.println("Toplam Tutar : " + toplam + " TL");


    }
}
