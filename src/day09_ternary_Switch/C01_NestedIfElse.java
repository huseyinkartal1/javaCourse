package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

//        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
//        bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
//        çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
//                Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz: ");
        String sayi=scan.next();
        int uzunluk=sayi.length();

        int sayiyeni=Integer.parseInt(sayi);

        if (uzunluk!=4) {

            System.out.println("4 basamakli bir sayi giriniz: ");

        }else if(sayiyeni%10==0 || sayiyeni%10==5){

            if(sayiyeni%10==0){

                System.out.println("sayiniz çifttir");
            }else{
                System.out.println("sayiniz tektir");
            }

            }else {
            System.out.println("Sayiniz 5 e bölünmüyor");

        }







    }




}
