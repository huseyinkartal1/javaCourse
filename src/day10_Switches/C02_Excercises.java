package day10_Switches;

import java.util.Scanner;

public class C02_Excercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();

        switch (sayi) {
            case 10:
                System.out.println("En kucuk iki basamakli sayi");
                break;
            case 100:
                System.out.println("En kucuk uc basamakli sayi");
                break;
            case 1000:
                System.out.println("En kucuk dort basamakli sayi");
                break;
            default:
                System.out.println("Tekrar deneyiniz");
        }




    }
}
