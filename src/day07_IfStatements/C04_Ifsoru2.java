package day07_IfStatements;

import java.util.Scanner;

public class C04_Ifsoru2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String ilkharf=scan.next().toUpperCase();

        if(ilkharf.equals("P")){
            System.out.println("Girilen harf ile başlayan günler: Pazar, Pazartesi,Persembe");
        }else if(ilkharf.equals("S")){
            System.out.println("Girilen harf ile başlayan günler: Salı");
        }else if(ilkharf.equals("C")){
            System.out.println("Girilen harf ile başlayan günler: Carsamba, Cuma, Cumartesi");
        }else{
            System.out.println("Girilen harf ile başlayan gün yoktur.");
        }














    }
}
