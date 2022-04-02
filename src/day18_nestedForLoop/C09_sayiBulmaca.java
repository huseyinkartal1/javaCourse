package day18_nestedForLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C09_sayiBulmaca {
    public static void main(String[] args) {

        // 1-100 arasında bir sayi tutturun
        // kullanıcıdan sayiyi tahmin etmesini isteyin
        // her tahminde sayiyi büyüt yada küçült diye yol gösterin
        // sayiyi bulduğunda kaç tahminde sayiyi bulduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int sayi = rand.nextInt(100);
        int tahmin = -1;
        List<Integer> tahminler = new ArrayList<Integer>();
        int tahminSayisi = 0;

        System.out.println("Bilgisayar 1-100 arasında bir sayı tutmuştur.");
        System.out.println("Tahminde bulununuz");
        int jokercountercift = 0;
        int jokercountertek = 0;

        while (tahmin != sayi && jokercountercift < 4 && jokercountertek < 4) {
            tahmin = scanner.nextInt();
            tahminler.add(tahmin);
            if (tahminler.contains(sayi / 2) && sayi % 2 == 0) {
                jokercountercift += 1;
            }

            if (jokercountercift == 3) {
                System.out.println("cevap 2 oncekı tahmınıznı 2 katı , bu son tahmın hakkınız");
            }
            if (tahminler.contains(sayi / 2) && sayi % 2 == 1) {
                jokercountertek += 1;
            }

            if (jokercountertek == 3) {
                System.out.println("cevap 2 oncekı tahmınıznı 2 katının bir fazlası , bu son tahmın hakkınız");
            }
            tahminSayisi++;
            if (tahminler.contains(sayi - 1) && tahminler.contains(sayi + 1) && ((sayi + 1 == tahmin) || sayi - 1 == tahmin)) {
                System.out.println("sayı ifşa oldu...");
            } else {
                if (tahmin > sayi && jokercountercift != 4 && jokercountertek != 4) {
                    System.out.println("Daha KÜÇÜK bir tahminde bulununuz...");
                } else if (tahmin < sayi && jokercountercift != 4 && jokercountertek != 4) {
                    System.out.println("Daha BÜYÜK bir tahminde bulununuz...");

                }

            }


        }
        if (tahminler.contains(sayi)) {
            System.out.println("tebrikler "+tahminSayisi+". tahminde bildiniz..");
        } else {
            System.out.println("Bilemediniz sayi " + sayi + " idi");
        }


    }
}

