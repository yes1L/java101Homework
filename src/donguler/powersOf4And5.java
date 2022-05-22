package donguler;

import java.util.Scanner;

public class powersOf4And5 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Sınır Sayısını Giriniz : ");
        n = inp.nextInt();

        System.out.println("4'ün kuvvetleri : ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri : ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
