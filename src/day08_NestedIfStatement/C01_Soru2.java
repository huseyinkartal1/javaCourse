package day08_NestedIfStatement;

import java.util.Scanner;

public class C01_Soru2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz");
        int sayi2=scan.nextInt();

        if(sayi1>0 && sayi2>0){
            System.out.println("Girilen sayilarin toplami: "+(sayi1+sayi2));
        }else if(sayi1<0 && sayi2<0){
            System.out.println("Girilen sayilarin çarpimi: "+(sayi1*sayi2));
        }else if(sayi1*sayi2<0){
            System.out.println("Farkli isaretlerdeki sayilara islem yapamazsiniz");
        }else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }







    }
}
