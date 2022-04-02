package day09_ternary_Switch;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        var sonuc= (Character.isLowerCase(harf))?"Kucuk harf":"Buyuk harf";

        System.out.println(Character.isLetter(harf)?(sonuc):"Harf degil");


    }
}
