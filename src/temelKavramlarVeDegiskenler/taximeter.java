package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        //değişkenler
        int km;
        double perKm = 2.20, startPrice = 10, total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = inp.nextInt();

        total = startPrice+(km*perKm);

        //Taksimetre Tutarı minimum 20tl
        boolean kosul = total <= 20;
        total = kosul ? 20 : total;
        //total = (total < 20) ? 20 : total;  >> Bir farklı kullanım

        System.out.println("Toplam Tutar : " + total);
    }
}
