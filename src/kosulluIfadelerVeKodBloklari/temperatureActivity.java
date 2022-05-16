package kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class temperatureActivity {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat <= 15) {
            if (heat >= 10) {
                System.out.println("Sinemaya gidebilirsiniz.");
                System.out.println("Pikniğe gidebilirsiniz.");
            } else {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
