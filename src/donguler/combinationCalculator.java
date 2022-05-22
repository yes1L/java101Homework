package donguler;

import java.util.Scanner;

public class combinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, c, totalN = 1, totalR = 1, totalNR = 1;

        System.out.println("* Kombinasyon Sayılarını Giriniz *");
        System.out.print("Birinci Sayı : ");
        n = input.nextInt();
        System.out.print("İkinci Sayı : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            totalN *= i;
        }

        for (int j = 1; j <= r; j++){
            totalR *= j;
        }

        for (int k = 1; k <= n-r; k++){
            totalNR *= k;
        }
        c = totalN / (totalR * totalNR);

        System.out.print("C(" + n + "," + r + ")" + " : ");
        System.out.println(c);
    }
}
