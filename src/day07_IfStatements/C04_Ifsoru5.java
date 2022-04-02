package day07_IfStatements;

import java.util.Scanner;

public class C04_Ifsoru5 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gun ismi giriniz");
        String ilkharf=scan.next().toUpperCase();

        if(ilkharf.equals("CUMA")){
            System.out.println("Girilen gun Müslümanlar için kutsal gündür.");
        }else if(ilkharf.equals("CUMARTESI")){
            System.out.println("Girilen gun Yahudiler için kutsal gündür.");System.out.println("Girilen harf ile başlayan günler: Salı");
        }else if(ilkharf.equals("PAZAR")){            System.out.println("Girilen gun Yahudiler için kutsal gündür.");System.out.println("Girilen harf ile başlayan günler: Salı");            System.out.println("Girilen gun Yahudiler için kutsal gündür.");System.out.println("Girilen harf ile başlayan günler: Salı");
            System.out.println("Girilen gun Hristiyanlar için kutsal gündür.");System.out.println("Girilen harf ile başlayan günler: Salı");System.out.println("Girilen harf ile başlayan günler: Carsamba, Cuma, Cumartesi");
        }else{
            System.out.println("Girilen gunun buyuk dinler icin kutsalligi yoktur");
        }











    }
}
