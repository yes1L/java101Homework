package kosulluIfadelerVeKodBlokları;

import java.util.Scanner;

public class gradePassStatus {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, lesson = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
        } else {
            lesson++;
        }

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        } else {
            lesson++;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        } else {
            lesson++;
        }

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        } else {
            lesson++;
        }

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        } else {
            lesson++;
        }


        double average = (mat + fizik + turkce + kimya + muzik) / lesson;


        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : " + average);


    }
}
