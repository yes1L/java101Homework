package kosulluIfadelerVeKodBlokları;

import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        //değişkenler
        int yearOfBirth, a;
        String zodiac = "", errorMessage="Hatalı bir doğum yılı giriş yaptınız, lütfen tekrar deneyiniz.";
        boolean isError=false;

        Scanner inp = new Scanner(System.in);

        //veri alma
        System.out.print("Doğum Yılınızı Giriniz : ");
        yearOfBirth = inp.nextInt();

        //çin zodyağı belirleme
        a = yearOfBirth % 12;

        switch (a) {
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.println(errorMessage);
        } else {
            System.out.println("Çin Zodyağı Burcunuz : " + zodiac);
        }
    }
}
