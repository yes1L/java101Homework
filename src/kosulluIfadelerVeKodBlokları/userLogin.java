package kosulluIfadelerVeKodBlokları;

import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        String userName, password, yeniSifre;
        int a;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");

            System.out.println("Şifrenizi Sıfırlamak İstiyor Musunuz?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz : ");
            a = inp.nextInt();


            switch (a) {
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    yeniSifre = input.nextLine();

                    if (yeniSifre.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Yeni Şifre Oluşturulmadı.");
                    break;
            }


        }
    }
}
