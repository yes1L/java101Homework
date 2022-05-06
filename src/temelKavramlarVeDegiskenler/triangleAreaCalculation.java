package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class triangleAreaCalculation {
    public static void main(String[] args) {

        int a,b,c;
        double u, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci Kenarı Giriniz : ");
        b = inp.nextInt();
        System.out.print("Üçüncü Kenarı Giriniz : ");
        c = inp.nextInt();

        u = (a+b+c) / 2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgen alanı : " + alan);
    }
}
