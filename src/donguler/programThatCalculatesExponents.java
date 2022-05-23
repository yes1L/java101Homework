package donguler;

import java.util.Scanner;

public class programThatCalculatesExponents {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, k, result = 1;

        System.out.print("Üssü alınacak sayı : ");
        n = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            result *= n;
        }
        System.out.println("Sonuç : "+result);
    }
}
