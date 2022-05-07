package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class circleSegmentArea {
    public static void main(String[] args) {
        int r, a;
        double pi=3.14, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap Uzunluğunu Giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz : ");
        a = inp.nextInt();

        alan = (pi * (r*r) * a) / 360;
        System.out.println("Daire Diliminin Alanı : " + alan);
    }
}
