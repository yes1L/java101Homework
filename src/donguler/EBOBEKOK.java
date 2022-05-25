package donguler;

import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int ebob = 1;
        int ekok = 1;

        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

        if (n1 < n2) {
            int i = n1;
            while (i >= 1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    break;
                }
                i--;
            }
        } else if (n1 > n2) {
            int i = n2;
            while (i >= 1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    break;
                }
                i--;
            }
        } else {
            ebob = n1;
        }
        System.out.println(n1 + " ve " + n2 + " sayısının EBOB'u : " + ebob);

        int k = 1;
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println(n1 + " ve " + n2 + " sayısının EKOK'u : " + ekok);
    }
}
