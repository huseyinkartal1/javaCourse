package day08_NestedIfStatement;

import java.util.Scanner;

public class C02_Soru12 {
    public static void main(String[] args) {

//        Kullanıcıdan 4 basamakli bir sayi girmesini isteyin Girdiği sayi 5 ’e
//        bölünüyorsa son rakamını kontrol edin Son rakamı 0 ise ekrana 5 ’e bölünen
//        çift sayı” yazdırın Son rakamı 0 değil ise 5 ’e bölünen tek sayı” yazdırın
//        Girdiği password 5 ’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın
//


        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz: ");
        int num=scan.nextInt();

        if(num%10==0 || num%10==5){

            if(num%10==0){

                System.out.println("5 e bölünen çift sayıdır.");
            }else{
                System.out.println("5 e bölünen tek sayıdır");
            }




        }else{
            System.out.println("Tekrar Deneyin.");
        }







    }
}
