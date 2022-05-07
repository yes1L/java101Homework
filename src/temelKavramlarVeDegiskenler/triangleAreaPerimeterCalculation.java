package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class triangleAreaPerimeterCalculation {
    public static void main(String[] args) {
        int r;
        double pi=3.14, alan, cevre;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yarı çap uzunluğunu giriniz : ");
        r = inp.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

    }
}
