package donguler;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3, balance = 1500, select;

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int priceIn = input.nextInt();
                            balance += priceIn;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int priceOut = input.nextInt();
                            if (priceOut > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= priceOut;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                switch (right) {
                    case 0:
                        System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                        break;
                    default:
                        System.out.println("Kalan hakkınız : " + right);
                        break;
                }
            }
        }
    }
}
