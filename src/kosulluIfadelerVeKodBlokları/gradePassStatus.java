package kosulluIfadelerVeKodBlokları;

import java.util.Scanner;

public class gradePassStatus {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();
        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        if ((mat < 0 || mat > 100) || (fizik < 0 || fizik > 100) || (turkce < 0 || turkce > 100) || (kimya < 0 || kimya > 100) || (muzik < 0 || muzik > 100)) {
            System.out.println("Girilen ders notları 0-100 arasında değildir. Lütfen tekrar deneyiniz.");
        } else {
            if (avarage <= 55) {
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız : " + avarage);
        }

    }
}
