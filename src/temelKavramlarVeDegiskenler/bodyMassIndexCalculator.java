package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class bodyMassIndexCalculator {
    public static void main(String[] args) {
        double boy, kilo, BMI;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu(metre cinsinde) Giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = inp.nextDouble();

        BMI = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+BMI);
    }
}
