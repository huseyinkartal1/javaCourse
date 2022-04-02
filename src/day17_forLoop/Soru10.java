package day17_forLoop;

public class Soru10 {
    public static void main(String[] args) {

        // iki sayı arasındaki sayıları toplama


        int num1 = 15;
        int num2 = 10;
        int toplam = 0;
        int distance = Math.abs(num1 - num2) - 1;


        if (num2 > num1) {

            for (int i = (num2 - 1); i > num1; i--) {
                toplam += i;
            }
            System.out.print(toplam);
        } else if (num1 > num2) {

            for (int i = (num1 - 1); i > num2; i--) {
                toplam += i;
            }
            System.out.print(toplam);
        } else {
            System.out.println("İki sayı eşittir.");
        }
    }
}
