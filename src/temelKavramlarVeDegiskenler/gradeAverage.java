package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class gradeAverage {
    public static void main(String[] args) {
        //Değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner Sınıfı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan Veri Alma
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();

        //Verilerin Ortalamasını Alma
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        //Ekrana Not Ortalaması Yazdırma
        System.out.println("Ortalamanız : "+sonuc);

        //Sınıf Geçip Geçmemesi?
        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);
    }
}
