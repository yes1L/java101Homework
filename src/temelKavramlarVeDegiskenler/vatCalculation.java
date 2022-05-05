package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class vatCalculation {
    public static void main(String[] args) {

        //Değişkenler
        double money, kdvOrani, kdvliTutar, kdvTutari;

        //Scanner Sınıfı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan Veri Alma
        System.out.print("Para Miktarınızı Giriniz : ");
        money = inp.nextDouble();

        //Girilen para miktarı 0-1000 arasında ise 18%, değilse 8% olarak hesaplama
        boolean kosul = money > 0 && money < 1000;
        kdvOrani = kosul ? 0.18 : 0.08;

        kdvTutari = money*kdvOrani;
        kdvliTutar = money + kdvTutari;



        // KDV tutarı 18%
        System.out.println("KDV Oranı : " + kdvOrani);

        //KDV'siz fiyat (direkt kullanıcıdan alınan tutar)
        System.out.println("KDV'siz Fiyat : " + money);

        //KDV tutarı
        System.out.println("KDV Fiyatı : " + kdvTutari);

        //KDV'li fiyat
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
    }
}
