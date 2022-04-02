package day08_NestedIfStatement;

import java.util.Scanner;

public class C02_Soru12_1 {
    public static void main(String[] args) {

        int uzunluk;
        int num1;


        // while (num1==1) {



        do{
            System.out.println("Lüften  5'e bölenebilen bir sayı giriniz");
            Scanner scan = new Scanner(System.in);
            String num = scan.next();
            uzunluk = num.length();
            num1 = Integer.parseInt(num);
            if (uzunluk == 4) {
                System.out.println("Girdiğiniz sayı 4 basamaklıdır");


                if (num1 % 10 == 0 || num1 % 10 == 5) {

                    if (num1 % 10 == 0) {
                        System.out.println("5'e bölünen çift sayi");
                    } else {
                        System.out.println("5'e bölünen tek sayi");
                    }
                    break;
                } else {
                    System.out.println("Sayınız 5'e tam bölünmüyor");
                }

            } else {
                System.out.println("Yeniden giriniz");

            }

        }while(num1 % 10 != 0 || num1 % 10 != 5);



    }
}
