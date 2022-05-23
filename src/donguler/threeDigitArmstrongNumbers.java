package donguler;

public class threeDigitArmstrongNumbers {
    public static void main(String[] args) {
        int armNumber=0;
        for (int i = 100; i <= 999; i++) {

            int number = i;
            int basNumber = 0;
            int tempNumber = number;
            int basValue;
            int result = 0;
            int basPow;


            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = number;

            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int j = 1; j <= basNumber; j++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if (result == number) {
                System.out.println(number + " sayısı bir Armstrong sayıdır.");
                armNumber++;
            }
        }
        System.out.println("Üç basamaklı toplam Armstrong sayısı : "+ armNumber);
    }
}
