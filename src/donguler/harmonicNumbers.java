package donguler;

import java.util.Scanner;

public class harmonicNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = inp.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println(result);
    }
}
