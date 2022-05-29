package donguler;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        int n = inp.nextInt();

        int fibonacci = 0, a = 0, b = 1;
        System.out.print(n+" Elemanlı Fibonacci Serisi : ");
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                fibonacci = a;
            } else if (i == 1) {
                fibonacci = a+b;
            }else{
                fibonacci = a+b;
                a=b;
                b=fibonacci;
            }

            System.out.print(fibonacci + " ");
        }
    }
}
