package day08_NestedIfStatement;

import java.util.Scanner;

public class C04_Interview10 {
    public static void main(String[] args) {
//        Soru
//        10 Interview Question
//        Kullanicidan artik yil olup olmadigini
//        kontrol etmek icin yil girmesini isteyin //1
//        Kural
//        1 4 ile bolunemeyen yillar artik yil
//                degildir
//        Kural
//        2 4 ’un kati olmasina ragmen 100 ile
//        bolunebilen yillardan sadece
//        400 ’un kati olan yillar artik yildir

        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int yil = scan.nextInt();


        if (yil % 100 != 0) {
            if (yil % 4 != 0) {
                System.out.println(yil + " artik yil degildir");
            } else {
                System.out.println("Artık yıldır");
            }
        } else {
            if (yil % 400 != 0) {
                System.out.println(yil + " artik yil degildir");
            } else {
                System.out.println("Artık yıldır");
            }

        }
    }
}
