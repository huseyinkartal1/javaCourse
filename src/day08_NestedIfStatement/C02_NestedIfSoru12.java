package day08_NestedIfStatement;

import java.util.Scanner;

public class C02_NestedIfSoru12 {
    public static void main(String[] args) {

        // SORU 12

int uzunluk;

        do {
            Scanner scan = new Scanner(System.in);

            String num = scan.next();
             uzunluk=num.length();
            int num1=Integer.parseInt(num);
            String str= String.valueOf(num);
            System.out.println(str);

            System.out.println("Please write a 4 digit number");


            if (uzunluk == 4) {


                if (num1 % 10 == 0 || num1 % 10 == 5) {

                    if (num1 % 10 == 0) {
                        System.out.println("5'e bölünen çift sayi");
                    } else {
                        System.out.println("5'e bölünen tek sayi");
                    }
                } else {
                    System.out.println("Sayınız 5'e tam bölünmüyor, Tekrar Deneyin");
                }
            }
            while (num1 % 10 != 5 || num1 % 10 != 0) ;

        } while (uzunluk != 4);
    }
}

