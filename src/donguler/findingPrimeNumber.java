package donguler;

import java.util.Scanner;

public class findingPrimeNumber {
    public static void main(String[] args) {
        String primenum = "";

        for (int i = 1; i <= 100; i++) {
            int count = 0;

            for (int j = i; j >= 1; j--) {

                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                primenum = primenum + i + " ";
            }
        }
        System.out.println(primenum);
    }
}
