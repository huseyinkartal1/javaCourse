package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {





        Scanner scan = new Scanner(System.in);

        System.out.println("Dört basamaklı bir tam sayı giriniz");

        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10; // birler basamağı
       rakamlarToplami+=rakam; // birler

        sayi/=10; // ilk üç basamağı verir

        rakam=sayi%10; // onlar basamağı
        rakamlarToplami+=rakam; // birler + onlar

        sayi/=10; // ilk üç basamağı verir

        rakam=sayi%10; // yüzler basamağı
        rakamlarToplami+=rakam; // birler + onlar + yüzler

        sayi/=10; // ilk üç basamağı verir

        rakam=sayi%10; // binler basamağı
        rakamlarToplami+=rakam; // birler + onlar + yüzler + binler


        System.out.println("Giriler sayının rakamlar toplamı: " + rakamlarToplami);









    }
}
