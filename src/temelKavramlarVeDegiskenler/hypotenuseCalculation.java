package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class hypotenuseCalculation {
    public static void main(String[] args) {

        int kenar1, kenar2, kenarCarpim;
        double hipotenus;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz : ");
        kenar1 = inp.nextInt();
        System.out.print("İkinci Kenarı Giriniz : ");
        kenar2 = inp.nextInt();

        hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Hiptenüs Uzunluğu : " + hipotenus);
    }
}
