package day11_stringManipulation;

import java.util.Scanner;

public class C06_E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String str1=scanner.nextLine();
        System.out.println("Bir harf giriniz");
        String str2=scanner.next();




        if(str1.toLowerCase().indexOf(str2)==(-1)){
            System.out.println("aranan harf cünlemede yoktur.");
        }{
            System.out.println("Aradığınız harfin index: "+str1.toLowerCase().indexOf(str2.toLowerCase()));

        };






    }
}
